package org.burnmydread.bolivar.pageobjects.cjoc

import geb.Page

/**
 * Created by zach on 6/15/17.
 */
class BlueSteelCreateTeam extends Page {
    static at = {
        waitFor(10, 0.01){ team_name_box.present }
        waitFor(10, 0.01){ team_name_button.present }
    }

    static content = {
       // cloud_bees_logo { $('.MasterLogo') }
        team_name_box { $('.TextInput-control') }
        team_name_button { $('button.active') }
        create_team_button { $('.submit')}
        ancor_team_icon { $('.anchor') }
        icon_select { $('.submit') }

    }
}
