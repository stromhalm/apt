/*-
 * APT - Analysis of Petri Nets and labeled Transition systems
 * Copyright (C) 2012-2015  Members of the project group APT
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

package uniol.apt.analysis.coverability;

import uniol.apt.adt.pn.PetriNet;
import uniol.apt.module.AptModule;
import uniol.apt.module.Module;

/**
 * Provide the coverability graph as a module.
 * @author Uli Schlachter, vsp
 */
@AptModule
public class ReachabilityModule extends CoverabilityModule implements Module {

	@Override
	public String getShortDescription() {
		return "Compute a Petri net's reachability graph";
	}

	@Override
	public String getName() {
		return "reachability_graph";
	}

	@Override
	protected CoverabilityGraph getGraph(PetriNet pn) {
		return CoverabilityGraph.getReachabilityGraph(pn);
	}
}

// vim: ft=java:noet:sw=8:sts=8:ts=8:tw=120
