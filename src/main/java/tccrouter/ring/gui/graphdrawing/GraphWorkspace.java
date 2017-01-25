/* 
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  - Redistributions of source code must retain the above copyright notice,
 * 	  this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *  - Neither the name of the Rin'G Project nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE 
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
 * IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package tccrouter.ring.gui.graphdrawing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;

import javax.swing.JOptionPane;
import javax.swing.event.MouseInputAdapter;

import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.GraphComponent;
import tccrouter.diamante.core.graph.Node;
import tccrouter.diamante.core.graph.SimpleNode;
import tccrouter.diamante.core.graph.layout.GraphLayout;
import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.extension.graph.property.ComponentColor;
import tccrouter.diamante.extension.graph.property.EdgeWeight;
import tccrouter.diamante.extension.graph.property.ID;
import tccrouter.diamante.extension.graph.property.Label;
import tccrouter.diamante.extension.graph.property.Position;
import tccrouter.gbl.controller.AIPreferencesController;
import tccrouter.ring.controller.DiamanteFacade;
import tccrouter.ring.controller.PreferencesController;
import tccrouter.ring.gui.UIFacade;
import tccrouter.ring.gui.event.WorkspaceObserver;
import tccrouter.ring.gui.vis2.CircleVisel;
import tccrouter.ring.gui.vis2.LabeledCircleVisel;
import tccrouter.ring.gui.vis2.LabeledLineVisel;
import tccrouter.ring.gui.vis2.LineVisel;
import tccrouter.ring.gui.vis2.Visel;
import tccrouter.ring.gui.vis2.ViselPane;

/**
 * A graph workspace responsible for drawing and handling user interaction
 * for simple graphs.
 */
public class GraphWorkspace extends ViselPane {

	/**
	 * Added by Guilherme Becker Lamounier
	 * for the Neural Net aproximation drawing.
	 */
	  private static final int    WAYPOINT_SIZE              =  4;
	  private static final int    WAYPOINT_SIZE2             =  2 * WAYPOINT_SIZE;
	  private  static final int   INTERNAL_CLIPPING_PADDING =  10;
	
	/**
	 * 
	 */
	private static final int NODE_RADIUS = 5;
	/**
	 * No selected mode.
	 */
	public final static int NONE = 0;
	/**
	 * The mode that expects the user to create or interact with nodes.
	 */
	public final static int NODE = 1;
	/**
	 * The mode that expects the user to create or interact with edges.
	 */
	public final static int EDGE = 2;
	/**
	 * The mode that expects the user to erase components from the graph.
	 */
	public final static int ERASER = 3;
	/**
	 * The mode that expects the user to select a node.
	 */
	public final static int NODE_SELECTION = 4;

	/**
	 * The current mode.
	 */
	int currentMode;
	/**
	 * The last selected mode.
	 */
	int previousMode;
	/**
	 * The current id, that will be attributed to a new node uppon its creation.
	 */
	int id;
	/** A counter for the number of nodes added, to create unique labels */
	int nodeCount;
	/**
	 * The starting visel that will be used for creating edges.
	 */
	Visel start;
	/**
	 * The graph that will be drawn in this workspace.
	 */
	Graph graph;
	/**
	 * The Graph Layout to draw the graph in workspace
	 */
	GraphLayout layout;
	/**
	 * A flag that indicates whether or not this workspace is editable.
	 */
	boolean editable;
	/**
	 * This workspace's listener. If this workspace is editable and the 
	 * listener is not null, the workspace will notify its listener when
	 * events take place. 
	 */
	WorkspaceObserver workspaceListener;
	/**
	 * 
	 */
	private UIFacade uiFacade = UIFacade.getInstance();
	/**
	 * 
	 */
	private DiamanteFacade diamanteFacade = DiamanteFacade.getInstance();
	/**
	 * 
	 */
	protected Visel movedVisel;

	/**
	 * The actions taken by the mouse interaction.
	 */
	final MouseInputAdapter mouseCtrl = new MouseInputAdapter() {
		boolean newNode = false;
		boolean newEdge = false;
		Visel draggedVisel;

		public void mouseClicked(MouseEvent e) {
			if (editable) {
				if (e.getButton() == MouseEvent.BUTTON1) {
					switch (currentMode) {
						case NODE:
							mouseReleased(e);
							break;
						case EDGE:
							if (!newEdge) {
								if (getViselAt(e.getPoint().x,e.getPoint().y) instanceof CircleVisel) {
									newEdge = true;
									movedVisel = new LabeledLineVisel(
											e.getPoint().x,
											e.getPoint().y,
											e.getPoint().x,
											e.getPoint().y,
											Color.BLACK,
											Visel.LOCATION_BACK,
											""
									);
									
									refreshVisel(movedVisel);
								}
							}
							else {
								if (getViselAt(e.getPoint().x,e.getPoint().y) instanceof CircleVisel) {
									
									LineVisel line = (LineVisel) movedVisel;
									
									if (line != null) {
										SimpleNode n1 = (SimpleNode) getObjectByVisel(getViselAt(
											line.getX(),
											line.getY()
										));
										SimpleNode n2 = (SimpleNode) getObjectByVisel(getViselAt(
											e.getPoint().x,
											e.getPoint().y
										));
										
										if (n1 != n2) {
											ComponentProperties properties = new ComponentProperties();
											ComponentColor edgeColor = new ComponentColor();
											
											// Retrieve the default color from the preferences controller
											Color prefColor = PreferencesController.getInstance().getColor(
												PreferencesController.PROPERTIES_CATEGORY,
												PreferencesController.EDGE_COLOR_PROPERTY,
												Color.BLACK
											);
											
											edgeColor.setValue(prefColor);

											double weight;
											// Retrieve the euclidian distance value from the AI preferences controller		
											if (
													AIPreferencesController.getInstance().getBoolean(
													AIPreferencesController.GENERAL_CATEGORY,
													AIPreferencesController.EUCLIDIAN_GRAPH_PROPERTY,
													false
													)
									           )									
											{
											  weight = euclidianDistance(n1,n2);
											} else {									
											  weight = uiFacade.generateWeight();
											}											
											
											properties.addProperty(
												new EdgeWeight(weight)
											);
											properties.addProperty(
												edgeColor
											);
				
											diamanteFacade.addEdge(
												((ID) n1.getProperties().getPropertyByName("ID")).getValue(),
												((ID) n2.getProperties().getPropertyByName("ID")).getValue(),
												properties
											);
										}
									}
								}
								else {
									uiFacade.setStatusMessage(
										"Select a final node to create an edge.");
								}

								movedVisel = null;
								newEdge = false;
								refresh();
							}
							break;
						case ERASER:
							{
								Visel del = getViselAt(e.getPoint().x,e.getPoint().y);
								
								if (del != null) {
									// remove element from the graph and the panel
									Object component = getObjectByVisel(del);
										
									if (component instanceof SimpleNode)
										diamanteFacade.removeNode((SimpleNode) component);
									else if (component instanceof Edge)
										diamanteFacade.removeEdge((Edge) component);
									removeVisel(del);
									refresh();
								}
							}
							break;
							
						case NODE_SELECTION:
							{
								Visel selectedNode = getViselAt(e.getPoint().x,e.getPoint().y);
								if (selectedNode != null) {
									Object obj = getObjectByVisel(selectedNode);
									if (obj instanceof SimpleNode) {
										SimpleNode node = (SimpleNode) getObjectByVisel(selectedNode);
										
										fireNodeSelected(
												((ID) node.getProperties().getPropertyByName("ID")).getValue()
										);
										
										currentMode = previousMode;										
									}
								}
							}
							break;
					}
				}
				else if (e.getButton() == MouseEvent.BUTTON3) {
					Visel visel = getViselAt(e.getPoint().x,e.getPoint().y);
					GraphComponent component = null;
					
					if (visel != null) {
						component = (GraphComponent) getObjectByVisel(visel);
						uiFacade.showPropertyInteractionWindow(
								component,
								new Point(e.getPoint().x + getX(),e.getPoint().y + getY())
						);
					}
				}
			}
		}
		
		public void mouseDragged(MouseEvent e) {
			switch (currentMode) {
				case NODE :
					if (draggedVisel != null) {
						/*SimpleNode node = (SimpleNode) getObjectByVisel(draggedVisel);
						Position pos = (Position) node.getProperties().getPropertyByName("Position");
						pos.setX(e.getX());
						pos.setY(e.getY());*/
						Graphics2D g2d = (Graphics2D) getGraphics();
						AffineTransform transform = new AffineTransform();
						transform.scale(2*NODE_RADIUS,2*NODE_RADIUS);
						
						if (movedVisel != null) {
							g2d.setClip(transform.createTransformedShape(draggedVisel.getShape()));
							drawTemporaryVisel(movedVisel);
						}
						
						g2d.setClip(transform.createTransformedShape(draggedVisel.getShape()));
						draggedVisel.setX(e.getX() - NODE_RADIUS);
						draggedVisel.setY(e.getY() - NODE_RADIUS);
						
						drawTemporaryVisel(draggedVisel);
					}
					break;
				case EDGE :
					if (draggedVisel != null) {
						LabeledLineVisel line = (LabeledLineVisel) draggedVisel;
						
						line.setX2(e.getPoint().x);
						line.setY2(e.getPoint().y);
						
						drawTemporaryVisel(draggedVisel);
					}
						/*if (fDrag != null) {
							fDrag.setPos(e.getPoint());
							repaint();
						}*/
					break;

				case ERASER :
					{
						// TODO  
					}
					break;
			}
			repaint();
		}
		
		public void mouseEntered(MouseEvent e) {
		}
		
		public void mouseExited(MouseEvent e) {
			mouseReleased(e);
		}
		
		public void mouseMoved(MouseEvent e) {
			switch(currentMode) {
				case EDGE:
					if (movedVisel != null) {
						LabeledLineVisel line = (LabeledLineVisel) movedVisel;
						
						line.setX2(e.getPoint().x);
						line.setY2(e.getPoint().y);
						
						drawTemporaryVisel(movedVisel);
					}
					/*if (movedVisel != null) {
						LabeledLineVisel line = (LabeledLineVisel) movedVisel;
						line.setX2(e.getPoint().x);
						line.setY2(e.getPoint().y);
						
						refreshVisel(line);
					}*/
			}
		}
		
		public void mousePressed(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON1) {
				switch (currentMode) {
					case NODE :
						{
							draggedVisel = getViselAt(e.getPoint().x,e.getPoint().y);

							id = graph.getN();
							if ((draggedVisel != null)/* && (draggedVisel instanceof Circle)*/) {
								newNode = false;
								movedVisel = new CircleVisel(
									draggedVisel.getX(), 
									draggedVisel.getY(),
									Visel.LOCATION_BACK,
									Color.WHITE,
									NODE_RADIUS
								);
								
								Graphics2D g2d = (Graphics2D) getGraphics();
								AffineTransform transform = new AffineTransform();
								transform.scale(2*NODE_RADIUS,2*NODE_RADIUS);
								
								g2d.setClip(transform.createTransformedShape(movedVisel.getShape()));
								drawTemporaryVisel(movedVisel);
							} 
							else if (draggedVisel == null) {
								newNode = true;
								draggedVisel = new LabeledCircleVisel(
									e.getPoint().x - NODE_RADIUS,
									e.getPoint().y - NODE_RADIUS,
									Visel.LOCATION_FRONT,
									Color.BLUE,
									NODE_RADIUS,
									"v" + nextNodeCount()//uiFacade.getGraph().getN()
								);

								draggedVisel.buildShape();
								//draggedVisel.paintVisel((Graphics2D) getGraphics());
								Graphics2D g2d = (Graphics2D) getGraphics();
								AffineTransform transform = new AffineTransform();
								transform.scale(2*NODE_RADIUS,2*NODE_RADIUS);

								g2d.setClip(transform.createTransformedShape(draggedVisel.getShape()));
								drawTemporaryVisel(draggedVisel);
							}
							repaint();
						}
						break;
	
					case EDGE :
						{
							/*if (!newEdge) {
								if (getViselAt(e.getPoint().x,e.getPoint().y) instanceof CircleVisel) {
									newEdge = true;
									draggedVisel = new LabeledLineVisel(
											e.getPoint().x,
											e.getPoint().y,
											e.getPoint().x,
											e.getPoint().y,
											Color.BLACK,
											Visel.LOCATION_BACK,
											""
									);
									
									refreshVisel(draggedVisel);
								}
							}*/

/*							Visel src = getViselAt(e.getPoint());
							if ((src != null) && (src instanceof Circle)) {
								fDrag =
									new Line(
										src.getPos(),
										e.getPoint(),
										Color.BLACK
									);
								fDrag.setActive(false);
								addBack(fDrag);
								repaint();
								start = src;
							}*/
						}
						break;
	
					case ERASER :
						{
							// TODO  
						}
						break;
				}
			}
		}
		
		public void mouseReleased(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON1) {
				switch (currentMode) {
					case NODE :
						{
							int idx = graph.getN();
							ComponentProperties properties;
							ComponentColor nodeColor = new ComponentColor();
							
							if (newNode && draggedVisel != null) {
								nodeColor.setValue(
									PreferencesController.getInstance().getColor(
										PreferencesController.PROPERTIES_CATEGORY,
										PreferencesController.NODE_COLOR_PROPERTY,
										Color.BLUE
									)
								);
								
								properties = new ComponentProperties();
								properties.addProperty(nodeColor);
								properties.addProperty(
									new Position(e.getX() - NODE_RADIUS, e.getY() - NODE_RADIUS));
								properties.addProperty(
									new Label(((LabeledCircleVisel) draggedVisel).getLabel()));
								properties.addProperty(new ID(nextID()));
								DiamanteFacade.getInstance().addNode(
									properties
								);
								
							} else {								
								Object obj = getObjectByVisel(draggedVisel);
								if (obj != null && obj instanceof SimpleNode) {
									SimpleNode node = (SimpleNode) getObjectByVisel(draggedVisel);
									Position pos = (Position) node.getProperties().getPropertyByName("Position");
									pos.setX(e.getX() - NODE_RADIUS);
									pos.setY(e.getY() - NODE_RADIUS);
								}
							}

							draggedVisel = null;
							movedVisel = null;
							refresh();
						}
						break;
	
					case EDGE :
						{
							/*if (getViselAt(e.getPoint().x,e.getPoint().y) instanceof CircleVisel) {
								int weight = uiFacade.generateWeight();
								LineVisel line = (LineVisel) draggedVisel;
								
								if (line != null) {
									SimpleNode n1 = (SimpleNode) getObjectByVisel(getViselAt(
										line.getX(),
										line.getY()
									));
									SimpleNode n2 = (SimpleNode) getObjectByVisel(getViselAt(
										e.getPoint().x,
										e.getPoint().y
									));
									
									if (n1 != n2) {
										ComponentProperties properties = new ComponentProperties();
										ComponentColor edgeColor = new ComponentColor();
										
										// Retrieve the default color from the preferences controller
										Color prefColor = PreferencesController.getInstance().getColor(
											PreferencesController.PROPERTIES_CATEGORY,
											PreferencesController.EDGE_COLOR_PROPERTY,
											Color.BLACK
										);
										
										edgeColor.setValue(prefColor);
										properties.addProperty(
											new EdgeWeight(weight)
										);
										properties.addProperty(
											edgeColor
										);
			
										diamanteFacade.addEdge(
											((ID) n1.getProperties().getPropertyByName("ID")).getValue(),
											((ID) n2.getProperties().getPropertyByName("ID")).getValue(),
											properties
										);
									}
								}
							}
							else {
								uiFacade.setStatusMessage(
									"Select a final node to create an edge.");
							}

							draggedVisel = null;
							newEdge = false;
							refresh();*/
								
/*							if (fDrag != null) {
								Visel dst = getViselAt(e.getPoint());
								if ((dst != null) && (dst instanceof Circle)) {
									LabelCircle v1 = (LabelCircle) start;
									LabelCircle v2 = (LabelCircle) dst;
									int weight = generateWeight();
									
									if (v1.getID() != v2.getID()) {
										fDrag.setPos(dst.getPos());
										ComponentProperties properties = new ComponentProperties();
										ComponentColor edgeColor = new ComponentColor();
										
										// Retrieve the default color from the preferences controller
										Color prefColor = PreferencesController.getInstance().getColor(
											PreferencesController.PROPERTIES_CATEGORY,
											PreferencesController.EDGE_COLOR_PROPERTY,
											Color.BLACK
										);
										
										edgeColor.setColor(prefColor);
										properties.addProperty(
											new EdgeWeight(weight)
										);
										properties.addProperty(
											edgeColor
										);
										DiamanteFacade.getInstance().addEdge(
											v1.getID(),
											v2.getID(),
											properties
										);
									}
								} else {
									remove(fDrag);
									uiFacade.setErrorMessage(
										"Select a final node to create an edge.");
								}
								fDrag.setActive(true);
								fDrag = null;
								refresh();
							}*/
						}
						break;
	
					case ERASER :
						{
							// TODO  
						}
						break;
				}
			}
		}
	};

	/**
	 * Creates an instance of this class. If the 'editable' flag is given as
	 * 'false', the graph will be shown but no operations will be made on it.
	 * @param g the graph that will be drawn in this workspace
	 * @param editable a flag to indicate whether or not this workspace
	 * is editable.
	 */
	public GraphWorkspace(Graph graph, boolean editable) {
		super(true);
		
		setBackground(new Color(245,245,245));
		this.setMode(NODE);
		this.id = this.nodeCount = graph.getN();
		this.setEditable(editable);
		this.graph = graph;
		this.workspaceListener = null;
	}

	/**
	 * @param draggedVisel
	 */
	protected void refreshVisel(Visel visel) {
		repaint();
		
		visel.buildShape();
	}
	
	/**
	 * 
	 * @param visel
	 */
	protected void drawTemporaryVisel(Visel visel) {
		repaint();
		
		visel.buildShape();
		visel.paintVisel((Graphics2D) getGraphics());
	}

	/**
	 * Sends a message to this workspace's listeners notifying them that
	 * a node has been selected.
	 * @param i the index of the selected node
	 */
	protected void fireNodeSelected(int i) {
		if (workspaceListener != null) {			
			workspaceListener.nodeSelected(i);
//			currentMode = previousMode;
		}
	}

	/**
	 * Sends a message to this workspace's listeners notifying them that
	 * the node selection phase has terminated.
	 */
	protected void fireNodeSelectionEnd() {
		if (workspaceListener != null) {
			workspaceListener.endNodeSelection();
		}
	}
	
	/**
	 * Sets the workspace mode.
	 * @param mode the new mode
	 */
	public void setMode(int mode) {
		currentMode = mode;
	}

	/**
	 * The next ID to be attributed to a new component.
	 * @return the next ID
	 */
	protected int nextID() {
		return id++;
	}
	
	/**
	 * The number of the next node to be added.
	 * @return the next node
	 */
	protected int nextNodeCount() {
		return nodeCount++;
	}

	/**
	 * Retrieves the current workspace mode.
	 * @return the current workspace mode
	 */
	public int getMode() {
		return (currentMode);
	}

	/**
	 * Repaints the workspace.
	 */
	public void refresh() {
		clear();

		buildNodeVisels();
		buildEdgeVisels();
		
		repaint();
	}
	
	/**
	 * 
	 */
	private void buildEdgeVisels() {
		int size = graph.getN();
		int i = 0,
			j = 0,
			k = 0,
			l = 0;
		
		while (i < size) {
			Node n1 = graph.getNode(k);
			
			if (n1 != null) {
				while (j < size) {
					Node n2 = graph.getNode(l);
					
					if (n2 != null) {
						if (graph.edgeExists(k, l)) {
							Position pos1, pos2;
							ComponentProperties propV1 = n1.getProperties();
							ComponentProperties propV2 = n2.getProperties();
							Edge edge = graph.getEdge(k,l);
							long weight;
							ComponentProperties edgeProp = edge.getProperties();
							EdgeWeight weightProp = (EdgeWeight)edgeProp.getPropertyByName("EdgeWeight");
							
							if (weightProp != null)
								weight = Math.round(weightProp.getValue());
							else {								
								weight = Math.round(generateWeight());
								edgeProp.addProperty(new EdgeWeight(weight));
							}
	
							pos1 = ((Position) propV1.getPropertyByName("Position"));
							pos2 = ((Position) propV2.getPropertyByName("Position"));
	
							LabeledLineVisel visel = 
								new LabeledLineVisel(
									pos1.getX() + NODE_RADIUS,
									pos1.getY() + NODE_RADIUS,
									pos2.getX() + NODE_RADIUS,
									pos2.getY() + NODE_RADIUS,
									((ComponentColor)edgeProp.getPropertyByName("ComponentColor")).getValue(),
									Visel.LOCATION_BACK,
									""+weight
								);
							/*ArrayList edges = new SimpleEdgePainter(
									pos1.getX() + NODE_RADIUS,
									pos1.getY() + NODE_RADIUS,
									pos2.getX() + NODE_RADIUS,
									pos2.getY() + NODE_RADIUS
							).drawEdge(0);
							
							CurvedLineVisel visel = new CurvedLineVisel(
									(Shape) edges.get(0),
									((ComponentColor)edgeProp.getPropertyByName("ComponentColor")).getValue(),
									Visel.LOCATION_BACK
							);*/
							
							visel.buildShape();
							addVisel(visel,edge);
						}
						j++;
					}
					l++;
				}
				i++;
			}
			j = 0;
			l = 0;
			k++;
		}

	}

	/**
	 * @return
	 */
	private void buildNodeVisels() {
		int size = graph.getN();
		int i = 0;
		int j = 0;
		
		while (j<size) {
			if (graph.getNode(i) != null) {
				ComponentProperties prop = (graph.getNode(i)).getProperties();
				ComponentColor color =
					(ComponentColor) prop.getPropertyByName("ComponentColor");
				Position pos = (Position) prop.getPropertyByName("Position");
				Label lbl = (Label) prop.getPropertyByName("Label");
				int IDNode = ((ID) prop.getPropertyByName("ID")).getValue();
				
				Visel nodeVisel =
					new LabeledCircleVisel(
							pos.getX(),
							pos.getY(),
							Visel.LOCATION_FRONT,
							color.getValue(),
							NODE_RADIUS,
							lbl.getValue()
					);
						
				nodeVisel.buildShape();
				addVisel(nodeVisel,graph.getNode(i));
				j++;
			}
			i++;
		}
	}

	/**
	 * Informs the workspace that the user must select a node; when he does,
	 * the main window will be informed of it.
	 * 
	 * @param sourceNode if the node to be selected is a source node.
	 */
	public void requestNode(boolean sourceNode) {
		previousMode = currentMode;
		this.setMode(GraphWorkspace.NODE_SELECTION);
		
		if (sourceNode) {
		JOptionPane.showMessageDialog(
					null,
					"Click on the source node for the selected algorithm",
					"Algorithm source node input",
					JOptionPane.QUESTION_MESSAGE
		);
		} else {
			JOptionPane.showMessageDialog(
					null,
					"Click on a client node to input it to the selected algorithm",
					"Algorithm client node input",
					JOptionPane.QUESTION_MESSAGE
		);			
		}
	}
	
	/**
	 * Informs the GUI that the user has stoped requesting nodes.
	 */
	public void stopRequestNodes() {
		fireNodeSelectionEnd();
		this.setMode(GraphWorkspace.NONE);
	}	
	
	
	/**
	 * Randomly generates weight for an edge.
	 * @return the generated weight
	 */
	double generateWeight() {

		double weight = (int)(10*Math.random());						

		if (weight == 0) weight = 1;
		
		return weight;
	}
	
	public double euclidianDistance(Node v1, Node v2) {

		/*
		 * distance estimate is based on the X,Y coordenates of the workspace.
		 */
		ComponentProperties cp = v1.getProperties();
		Position v1Position = (Position)cp.getPropertyByName("Position");

		ComponentProperties cp2 = v2.getProperties();
		Position v2Position = (Position)cp2.getPropertyByName("Position");
		
	      double dX
	        = Math.abs
	          (
	            v1Position.getX() - v2Position.getX()
	          );

	      double dY
	        = Math.abs
	          (
	        	v1Position.getY() - v2Position.getY()
	          );

      return Math.sqrt( ( dX * dX ) + ( dY * dY ) );
	}

	public double euclidianDistance(int v1, int v2) {
		return euclidianDistance(graph.getNode(v1),graph.getNode(v2));
	}
	
	/**
	 * @return
	 */
	public boolean isEditable() {
		return editable;
	}

	/**
	 * @param editable
	 */
	public void setEditable(boolean editable) {
		this.editable = editable;
		
		if (editable) {
			this.addMouseListener(mouseCtrl);
			this.addMouseMotionListener(mouseCtrl);
		}
	}

	/**
	 * @param g
	 */
	public void setGraph(Graph g) {
		this.graph = g;
	}

	/**
	 * @param workspaceListener
	 */
	public void setListener(WorkspaceObserver listener) {
		workspaceListener = listener;
	}
	
	/**
	 * Runs the GraphLayout on the active graph.
	 */
	public void doGraphLayout() {
		layout.doLayout(this);
		refresh();
	}
	
	/**
	 * Sets the prefered layout
	 */
	public void setLayout(GraphLayout layout){
		this.layout = layout;
	}

	/**
	 * Return the current graphs in workspace
	 * @return g return the current graph
	 */
	public Graph getGraph() {
		return graph;
	}
	
	/**
	 * 
	 */
	public void highlightEdge(int n1, int n2) {
		Node node1 = graph.getNode(n1);
		Node node2 = graph.getNode(n2);
		
		if (node1 != null && node2 != null) {
			Position pos1 = (Position) node1.getProperties().getPropertyByName("Position");
			Position pos2 = (Position) node2.getProperties().getPropertyByName("Position");
			
			LabeledLineVisel visel = 
				new LabeledLineVisel(
					pos1.getX() + NODE_RADIUS,
					pos1.getY() + NODE_RADIUS,
					pos2.getX() + NODE_RADIUS,
					pos2.getY() + NODE_RADIUS,
					Color.BLACK,
					Visel.LOCATION_BACK,
					""
				);
			
			visel.buildShape();
			LineHighlightEffect effect = 
				new LineHighlightEffect(
					visel.getShape(),
					(Graphics2D)this.getGraphics(),
					200,
					this,
					graph.edgeExists(n1,n2)
				);
			effect.startEffect();
		}
	}

	/**
	 * Method added for the AI  expansion implementation.
	 * @author Guilherme Becker Lamounier
	 * @return
	 */
	public Dimension getWorkspaceDimension() {
		return this.getSize();
	}
	
	/**
	 * To draw arbitrary nodes on the Workspace.
	 * Method added for the AI  expansion implementation.
	 * @author Guilherme Becker Lamounier
	 */
	  public void drawNodes
	  (
	    int   nodes[][],
	    int   nodesCount,
	    int   nodeX,
	    int   nodeY,
	    Color nodeColor
	  )
	  {
	    Graphics gi = this.getGraphics();

	    // draw oval circles on the workspace
	    gi.setColor(nodeColor);

	    for (int i = 0; i < nodesCount; ++i)
	    {
	      gi.fillOval
	      (
	        nodes[i][nodeX] - WAYPOINT_SIZE + INTERNAL_CLIPPING_PADDING,
	        nodes[i][nodeY] - WAYPOINT_SIZE + INTERNAL_CLIPPING_PADDING,
	        WAYPOINT_SIZE2,
	        WAYPOINT_SIZE2
	      );
	    }
	  }
		
	/**
	 * To draw arbitrary edges on the Workspace.
     * Method added for the AI  expansion implementation.
	 * @author Guilherme Becker Lamounier
	 */	  
	  public void drawEdges
	  (
	    int nodeList[],
	    int numberOfNodes,
	    int nodeDrawAtLocations[][],
	    int nodeX,
	    int nodeY,
	    Color edgeColor,
	    boolean closePath
	  )
	  {
	    Graphics gi = getGraphics();
	    gi.setColor( edgeColor );

	    for (int n = 1; n < numberOfNodes; ++n)
	    {
	      gi.drawLine
	      (
	        nodeDrawAtLocations[nodeList[n-1]][nodeX] + INTERNAL_CLIPPING_PADDING,
	        nodeDrawAtLocations[nodeList[n-1]][nodeY] + INTERNAL_CLIPPING_PADDING,
	        nodeDrawAtLocations[nodeList[n]][nodeX] + INTERNAL_CLIPPING_PADDING,
	        nodeDrawAtLocations[nodeList[n]][nodeY] + INTERNAL_CLIPPING_PADDING
	      );
	    }

	    if ( closePath )
	    {
	      gi.drawLine
	      (
	        nodeDrawAtLocations[nodeList[numberOfNodes - 1]][nodeX]
	        + INTERNAL_CLIPPING_PADDING,
	        nodeDrawAtLocations[nodeList[numberOfNodes - 1]][nodeY]
	        + INTERNAL_CLIPPING_PADDING,
	        nodeDrawAtLocations[nodeList[0]][nodeX] + INTERNAL_CLIPPING_PADDING,
	        nodeDrawAtLocations[nodeList[0]][nodeY] + INTERNAL_CLIPPING_PADDING
	      );
	    }
	  }
	  
}
