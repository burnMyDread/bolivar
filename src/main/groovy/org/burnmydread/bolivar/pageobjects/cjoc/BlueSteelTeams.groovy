package org.burnmydread.bolivar.pageobjects.cjoc

import geb.Page

/**
 * Created by zach on 6/15/17.
 */
class BlueSteelTeams extends Page {
    static at = {
        waitFor(60, 0.25){ cloud_bees_logo.present }
        waitFor(10, 0.1){ create_team_button.present }
        waitFor(10, 0.1){ team_search.present }
    }

    static content = {
        cloud_bees_logo { $('#root > div > section > div > div > div.ExtensionPoint.jenkins-header-logo > div > a') }
        create_team_button { $('#outer > main > article > div > div > div > div.right-container > a') }
        team_search { $('#outer > main > article > div > div > div > div.left-container > div > div > input') }

    }
}
