/*
 * SK's Minecraft Launcher
 * Copyright (C) 2010-2014 Albert Pham <http://www.sk89q.com> and contributors
 * Please see LICENSE.txt for license information.
 */

package com.skcraft.launcher.swing;

import com.skcraft.launcher.Instance;

public class InstanceComboBox extends DefaultComboBox<Instance> {

	public InstanceComboBox() {
		super();
		/*
		setTableHeader(null);
		setRowHeight(64);
		*/
	}

	/*
	@Override
	public void setModel(final TableModel dataModel) {
		super.setModel(dataModel);
		try {
			getColumnModel().getColumn(0).setCellRenderer(new InstanceCellFactory());
		} catch (final ArrayIndexOutOfBoundsException e) {
		}
	}
	*/
}
