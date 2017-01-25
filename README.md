# routerapp
Graph Routing Simulation Tool. Java Desktop educational application.

------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------
-- 
-- The AI Graph Router
--
------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------
-- 
-- Comments: Instructions to create workspace configuration 
--
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------

Java Project (Resuires Maven to build and run)

1. clone the project
2. build: mvn clean install
3. run: mvn exec:java -Dexec.mainClass="tccrouter.ring.Main" 

DB Connection (If you wish to save graph objects in DB):

1. add jars from /jdbc/* to project build path (Add any aditional jar file for specific DB)
2. Run the create_DB.txt script on your prefered DB
3. edit JDBCProperties.java for specific DB connection (user, pass, etc...)

On Eclipse:
. Run, Debug as a java project

Graph Building

1. Click on the node icon and then click on any point in the 2d map screen, this will build a new Node

2. Click on the edge icon and then click on the initial node, then click on a second node, to build a new Edge

3. You can click on any node, and drag it to a new location

4. Right Click to adjust Edge weights, Node colors

5. click on the Algorithm menu, choose a specific algorithm, each algorithm family targets a specific problem
   there are separators on the menu that divides each algorithm family, the initial ones targets the 
   Shortest Path problem, the second section targets the Traveling Salesman Problem (TSP) and the last 
   section targets the Vehicle Routing Problem (VRP) and Vehicle Routing Problem with Time Windows (VRP-TW) 
