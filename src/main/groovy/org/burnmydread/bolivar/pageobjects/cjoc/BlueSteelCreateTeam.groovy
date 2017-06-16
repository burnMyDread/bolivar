package org.burnmydread.bolivar.pageobjects.cjoc

import geb.Page

/**
 * Created by zach on 6/15/17.
 */
class BlueSteelCreateTeam extends Page {
    static at = {
        waitFor(60, 0.25){ cloud_bees_logo.present }
        waitFor(10, 0.1){ directions.present }
        waitFor(10, 0.1){ team_name_box.present }
        waitFor(10, 0.1){ create_team_button.present }
    }

    static content = {
        cloud_bees_logo { $('#root > div > section > div > div > div.ExtensionPoint.jenkins-header-logo > div > a') }
        directions { $('#outer > div > main > article > div > div.vertical-step-component.active.first-step > div.step-content > h1') }
        team_name_box { $('#outer > div > main > article > div > div.vertical-step-component.active.first-step > div.step-content > div > div > div > input') }
        create_team_button { $('#outer > div > main > article > div > div.vertical-step-component.active.first-step > div.step-content > div > div > button')}
    }
}
