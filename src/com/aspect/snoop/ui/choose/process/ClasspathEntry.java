/*
 * Copyright, Aspect Security, Inc.
 *
 * This file is part of JavaSnoop.
 *
 * JavaSnoop is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JavaSnoop is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with JavaSnoop.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.aspect.snoop.ui.choose.process;

import java.io.File;
import javassist.ClassPath;

public class ClasspathEntry {

    private final String file;
    private final ClassPath cp;

    ClasspathEntry(String file, ClassPath cp) {
        this.file = file;
        this.cp = cp;
    }

    public String getStringEntry() {
        return file;
    }

    public ClassPath getEntry() {
        return cp;
    }

    public boolean isJar() {
        return ! new File(file).isDirectory();
    }
}
