/*-
 * APT - Analysis of Petri Nets and labeled Transition systems
 * Copyright (C) 2012-2013  Members of the project group APT
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package uniol.apt.analysis.cycles.lts;

import java.util.List;

import uniol.apt.adt.ts.ParikhVector;
import uniol.apt.util.Pair;

/**
 * Datastructure for storing two counterexamples for the module.
 * @author Manuel Gieseking
 */
public class CycleCounterExample {

	private Pair<List<String>, ParikhVector> first;
	private Pair<List<String>, ParikhVector> second;

	/**
	 * Constructor for creating a new counter example for the cycles.
	 * @param first  - the cycle and the belonging parikhvector.
	 * @param second - the cycle and the belonging parikhvector.
	 */
	public CycleCounterExample(Pair<List<String>, ParikhVector> first, Pair<List<String>, ParikhVector> second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Counter-example: \n");
		sb.append("Cycle: ").append(first.getFirst().toString()).append(" ");
		sb.append("Parikhvector: ").append(first.getSecond().toString()).append("\nversus:\n");
		sb.append("Cycle: ").append(second.getFirst().toString()).append(" ");
		sb.append("Parikhvector: ").append(second.getSecond().toString());
		return sb.toString();
	}

	/**
	 * Returns the first counter example.
	 * @return the first counter example.
	 */
	public Pair<List<String>, ParikhVector> getFirst() {
		return first;
	}

	/**
	 * Sets the first counter example.
	 * @param first - the first counter example to set.
	 */
	public void setFirst(Pair<List<String>, ParikhVector> first) {
		this.first = first;
	}

	/**
	 * Returns the second counter example.
	 * @return the second counter example.
	 */
	public Pair<List<String>, ParikhVector> getSecond() {
		return second;
	}

	/**
	 * Sets the first counter example.
	 * @param second - the second counter example to set.
	 */
	public void setSecond(Pair<List<String>, ParikhVector> second) {
		this.second = second;
	}
}

// vim: ft=java:noet:sw=8:sts=8:ts=8:tw=120
