
/*
** This code was written by Kent Paul Dolan.  See accompanying file
** TravellerDoc.html for status for your use.
*/

package tccrouter.gbl.tsp.genetic.entity;

import tccrouter.gbl.tsp.genetic.RouletteWheel;


public interface ConsultiveReproducer extends Reproducer
{
  RuntimeException m_errIncompatible =
    new RuntimeException
    ("incompatible chromosomes in consultive reproduction");

  public Chromosome reproduce
  (
    Chromosome consultor,
    Chromosome [] consultees,
    RouletteWheel biaser
  );
}

