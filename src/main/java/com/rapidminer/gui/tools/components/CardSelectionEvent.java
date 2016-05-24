/**
 * Copyright (C) 2001-2016 by RapidMiner and the contributors
 *
 * Complete list of developers available at our web site:
 *
 * http://rapidminer.com
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Affero General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see http://www.gnu.org/licenses/.
 */
package com.rapidminer.gui.tools.components;

import java.util.EventObject;


/**
 * An Event for the {@link ButtonBarCardPanel}, fires when a card is selected.
 * 
 * @author Dominik Halfkann
 */
public class CardSelectionEvent extends EventObject {

	private static final long serialVersionUID = 1L;

	private String cardKey;

	public CardSelectionEvent(Object source, String cardKey) {
		super(source);
		this.cardKey = cardKey;
	}

	public String getCardKey() {
		return cardKey;
	}
}