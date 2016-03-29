package de.uni_potsdam.hpi.asg.resyntool.io;

/*
 * Copyright (C) 2012 - 2014 Norman Kluge
 * 
 * This file is part of ASGresyn.
 * 
 * ASGresyn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * ASGresyn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with ASGresyn.  If not, see <http://www.gnu.org/licenses/>.
 */

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class ToolConfig {
    @XmlElement(required = true)
    public String desijcmd;
    @XmlElement(required = true)
    public String balsaccmd;
    @XmlElement(required = true)
    public String balsanetlistcmd;
    @XmlElement(required = true)
    public String petrifycmd;
    @XmlElement(required = false)
    public String petresetcmd;
    @XmlElement(required = false)
    public String mpsatcmd;
    @XmlElement(required = false)
    public String punfcmd;
    @XmlElement(required = false)
    public String asglogiccmd;
}
