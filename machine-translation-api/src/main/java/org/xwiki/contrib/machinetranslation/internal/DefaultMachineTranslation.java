/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.machinetranslation.internal;

import java.util.Locale;

import org.xwiki.contrib.machinetranslation.MachineTranslation;
import org.xwiki.model.reference.DocumentReference;

/**
 * Default implementation of {@link MachineTranslation}.
 *
 * @version $Id$
 */
public class DefaultMachineTranslation implements MachineTranslation
{
    private final DocumentReference reference;

    private final Locale locale;

    private final String title;

    DefaultMachineTranslation(DocumentReference reference, Locale locale, String title)
    {
        this.reference = reference;
        this.locale = locale;
        this.title = title;
    }

    @Override
    public DocumentReference getDocumentReference()
    {
        return reference;
    }

    @Override
    public Locale getLocale()
    {
        return locale;
    }

    @Override
    public String getTitle()
    {
        return title;
    }
}
