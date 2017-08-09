package org.burnmydread.bolivar.pageobjects.bluesteel

import geb.Page

/**
 * Created by zach on 6/15/17.
 */
class BlueSteelTeams extends Page {
    static at = {
      //  waitFor(60, 0.25){ cloud_bees_logo.present }
        waitFor(60, 0.25){ create_team_button.present }
        waitFor(10, 0.01){ team_search.present }
    }

    static content = {

        cloud_bees_logo { $('.MasterLogo') }
        create_team_button { $('.btn-secondary') }
        team_search { $('.TextInput-control') }
        first_team { $('td.vertical-center > a:nth-child(2)') }
    }
}
