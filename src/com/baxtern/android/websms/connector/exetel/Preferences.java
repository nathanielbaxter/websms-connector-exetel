/*
 * Copyright (C) 2010 Nathaniel Baxter
 * This program is based off and uses WebSMS. Copyright (C) 2010 Felix Bechstein
 * 
 * This file is part of WebSMS Connector: Exetel.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; If not, see <http://www.gnu.org/licenses/>.
 */
package com.baxtern.android.websms.connector.exetel;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Preferences.
 * 
 * @author Nathaniel Baxter
 */
public final class Preferences extends PreferenceActivity {
	/** Preference key: enabled. */
	static final String PREFS_ENABLED = "enable_exetel";

	/** Preference's user: the exetel api username. */
	static final String PREFS_USER = "user_exetel";
	/** Preference's password: the exetel api password. */
	static final String PREFS_PASSWORD = "password_exetel";

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.addPreferencesFromResource(R.xml.connector_exetel_prefs);
	}
}
