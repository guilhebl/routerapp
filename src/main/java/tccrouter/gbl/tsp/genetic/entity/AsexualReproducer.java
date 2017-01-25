
/*
** This code was written by Kent Paul Dolan.  See accompanying file
** TravellerDoc.html for status for your use.
*/

package tccrouter.gbl.tsp.genetic.entity;


public interface AsexualReproducer extends Reproducer
{
  public Chromosome reproduce(Chromosome parent);
}

