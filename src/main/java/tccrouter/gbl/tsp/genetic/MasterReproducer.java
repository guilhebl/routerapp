package tccrouter.gbl.tsp.genetic;

import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.tsp.genetic.entity.MutatorVector;
import tccrouter.gbl.tsp.genetic.entity.ReproducerVector;
import tccrouter.gbl.tsp.genetic.reproducers.asexual.Clone;
import tccrouter.gbl.tsp.genetic.reproducers.asexual.DisorderedSlide;
import tccrouter.gbl.tsp.genetic.reproducers.asexual.Invert;
import tccrouter.gbl.tsp.genetic.reproducers.asexual.Move;
import tccrouter.gbl.tsp.genetic.reproducers.asexual.OrderedSlide;
import tccrouter.gbl.tsp.genetic.reproducers.asexual.Swap;
import tccrouter.gbl.tsp.genetic.reproducers.consultive.InverOver;
import tccrouter.gbl.tsp.genetic.reproducers.sexual.CyclicCrossover;
import tccrouter.gbl.tsp.genetic.reproducers.sexual.OrderedCrossover;
import tccrouter.gbl.tsp.genetic.reproducers.sexual.PartialMatchCrossover;


public class MasterReproducer
{


  public static ReproducerVector hookReproducers()
  {

    // define the reproduction operators
    ReproducerVector reproducers = new ReproducerVector();


/*
**  In general, we don't want the clone reproducer to run at all, it is
**  just here so that the reproducer vector cannot be empty despite user
**  choices, so choose a very small weight which will work as a very big
**  weight if it is the only reproducer in the vector.
*/

    reproducers.addReproducer(new Clone(), 0.01F);
    
    if(TSProblemModel.getInstance().isCyclicCrossover())
    {
      reproducers.addReproducer(new CyclicCrossover(), 50.0F);
    }

//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_HEURISTIC_EDGE_PRESERVING_CROSSOVER
//      )
//    )
//    {
//      reproducers.addReproducer(new EdgePreservingCyclicCrossover(), 50.0F);
//    }
//
    if (TSProblemModel.getInstance().isOrederedCrossover())
    {
      reproducers.addReproducer(new OrderedCrossover(), 50.0F);
    }

    if (TSProblemModel.getInstance().isPmxCrossover())
    {
      reproducers.addReproducer(new PartialMatchCrossover(), 50.0F);
    }
    
//    if (TSProblemModel.getInstance().isRollingCrossover())
//    {
//      reproducers.addReproducer(new RollingCrossover(), 100.0F);
//    }

    if (TSProblemModel.getInstance().isInverOver()) 
    {
      reproducers.addReproducer(new InverOver(), 50.0F);
    }
//
//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_HEURISTIC_DEWRINKLER
//      )
//    )
//    {
//      reproducers.addReproducer(new Dewrinkler(), 10.0F);
//    }
//
//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_HEURISTIC_DISORDERED_SLIDE
//      )
//    )
//    {
//      reproducers.addReproducer(new DisorderedSlide(), 10.0F);
//    }
//
//    if
//    (
//      CheckBoxControls.getState(CheckBoxControls.CBC_HEURISTIC_INVERT)
//    )
//    {
//      reproducers.addReproducer(new Invert(), 10.0F);
//    }
//
//    if (CheckBoxControls.getState(CheckBoxControls.CBC_HEURISTIC_MOVE))
//    {
//      reproducers.addReproducer(new Move(), 10.0F);
//    }
//
//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_HEURISTIC_OPTIMIZE_NODES_AND_EDGES_NEAR_A_POINT
//      )
//    )
//    {
//      reproducers.addReproducer(new OptimizeNodesAndEdgesNearAPoint(), 10.0F);
//    }
//
//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_HEURISTIC_OPTIMIZE_NODES_AND_EDGES_NEAR_EVERY_CITY
//      )
//    )
//    {
//      reproducers.addReproducer
//      (
//        new OptimizeNodesAndEdgesNearEveryCity(),
//        10.0F
//      );
//    }
//
//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_HEURISTIC_OPTIMIZE_NODES_NEAR_A_POINT
//      )
//    )
//    {
//      reproducers.addReproducer(new OptimizeNodesNearAPoint(), 10.0F);
//    }
//
//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_HEURISTIC_OPTIMIZE_NODES_NEAR_EVERY_CITY
//      )
//    )
//    {
//      reproducers.addReproducer(new OptimizeNodesNearEveryCity(), 10.0F);
//    }
//
//    if (CheckBoxControls.getState(CheckBoxControls.CBC_HEURISTIC_ORDERED_SLIDE))
//    {
//      reproducers.addReproducer(new OrderedSlide(), 10.0F);
//    }
//
//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_HEURISTIC_PERMUTE_A_SUBLIST
//      )
//    )
//    {
//     reproducers.addReproducer
//     (
//       new PermuteCitiesWithinASublist(), 10.0F
//     );
//    }
//
//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_HEURISTIC_PERMUTE_CUTS_NEAR_A_POINT
//      )
//    )
//    {
//     reproducers.addReproducer
//     (
//       new PermuteCutsNearAPoint(), 10.0F
//     );
//    }
//
//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_HEURISTIC_PERMUTE_CUTS_NEAR_EVERY_CITY
//      )
//    )
//    {
//     reproducers.addReproducer
//     (
//       new PermuteCutsNearEveryCity(), 10.0F
//     );
//    }
//
//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_HEURISTIC_PERMUTE_SINGLES
//      )
//    )
//    {
//     reproducers.addReproducer(new PermuteScatteredCities(), 10.0F);
//    }
//
//    if 
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_HEURISTIC_PERMUTE_SUBLISTS
//      )
//    )
//    {
//     reproducers.addReproducer
//     (
//       new PermuteSeveralSublistsOfCities(), 10.0F
//     );
//    }
//
//    if
//    (
//      CheckBoxControls
//      .getState(CheckBoxControls.CBC_HEURISTIC_QUASI_QUICK_SORT)
//    )
//    {
//      reproducers.addReproducer(new QuasiQuickSort(), 10.0F);
//    }
//
//    if
//    (
//      CheckBoxControls
//      .getState(CheckBoxControls.CBC_HEURISTIC_QUASI_SHELL_SORT_INVERTER)
//    )
//    {
//      reproducers.addReproducer(new QuasiShellSortInverter(), 10.0F);
//    }
//
//    if
//    (
//      CheckBoxControls
//      .getState(CheckBoxControls.CBC_HEURISTIC_QUASI_SHELL_SORT_SWAPPER)
//    )
//    {
//      reproducers.addReproducer(new QuasiShellSortSwapper(), 10.0F);
//    }
//
//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_HEURISTIC_RANDOM_LOOP_CUTS
//      )
//    )
//    {
//      reproducers.addReproducer(new RandomCityLoopForNearbyCuts(), 10.0F);
//    }
//
//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_HEURISTIC_RANDOM_LOOP_NODES
//      )
//    )
//    {
//      reproducers.addReproducer(new RandomCityLoopForNearbyNodes(), 10.0F);
//    }
//
//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_HEURISTIC_RANDOM_LOOP_NODES_AND_EDGES
//      )
//    )
//    {
//      reproducers.addReproducer(new RandomCityLoopForNearbyNodesAndEdges(), 10.0F);
//    }
//
//    if
//    (
//      CheckBoxControls.getState(CheckBoxControls.CBC_HEURISTIC_SMOOTHER)
//    )
//    {
//      reproducers.addReproducer(new Smoother(), 10.0F);
//    }
//
//    if
//    (
//      CheckBoxControls.getState(CheckBoxControls.CBC_HEURISTIC_SNOW_PLOW)
//    )
//    {
//      reproducers.addReproducer(new SnowPlow(), 10.0F);
//    }
//
//    if
//    (
//      CheckBoxControls.getState(CheckBoxControls.CBC_HEURISTIC_SNOW_PLOW_SQUEEZEBOX)
//    )
//    {
//      reproducers.addReproducer(new SnowPlowSqueezebox(), 10.0F);
//    }
//
//    if (CheckBoxControls.getState(CheckBoxControls.CBC_HEURISTIC_SWAP))
//    {
//      reproducers.addReproducer(new Swap(), 10.0F);
//    }

    return reproducers;
  }

  public static MutatorVector hookMutators()
  {
    // define the mutation operators
    MutatorVector mutators = new MutatorVector();

/*
** I have been wanting to have more than one of these for a very long
** time.
*/


    mutators.addMutator(new DisorderedSlide(), 10.0F);
    mutators.addMutator(new OrderedSlide(), 10.0F);
    mutators.addMutator(new Invert(), 10.0F);
    mutators.addMutator(new Move(), 10.0F);
    mutators.addMutator(new Swap(), 10.0F);

    return mutators;
  }

}
