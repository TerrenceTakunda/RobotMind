/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *  
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *  
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.cuius.robotmind;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author terrence
 */
@Named(value = "schedules")
@SessionScoped
public class Schedules implements Serializable {

    private String schedule1;
    private String schedule2;
    private String schedule3;
    private String schedule4;
    private String schedule5;
    /**
     * Creates a new instance of Schedules
     */
    public Schedules() {
    }

    public String getSchedule1() {
        return schedule1;
    }

    public void setSchedule1(String schedule1) {
        this.schedule1 = schedule1;
    }

    public String getSchedule2() {
        return schedule2;
    }

    public void setSchedule2(String schedule2) {
        this.schedule2 = schedule2;
    }

    public String getSchedule3() {
        return schedule3;
    }

    public void setSchedule3(String schedule3) {
        this.schedule3 = schedule3;
    }

    public String getSchedule4() {
        return schedule4;
    }

    public void setSchedule4(String schedule4) {
        this.schedule4 = schedule4;
    }

    public String getSchedule5() {
        return schedule5;
    }

    public void setSchedule5(String schedule5) {
        this.schedule5 = schedule5;
    }
    
    public void theSchedule(){
        
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Success!", "Schedule set Seccefully"));
        
    }
}
