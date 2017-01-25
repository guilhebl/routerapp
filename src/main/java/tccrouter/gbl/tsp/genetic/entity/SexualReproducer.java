
/*
** This code was written by Kent Paul Dolan.  See accompanying file
** TravellerDoc.html for status for your use.
*/

package tccrouter.gbl.tsp.genetic.entity;


public interface SexualReproducer extends Reproducer
{
  RuntimeException m_errIncompatible =
    new RuntimeException
    ("incompatible chromosomes in sexual reproduction");

  public Chromosome reproduce(Chromosome father, Chromosome mother);
}
