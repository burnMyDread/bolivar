package org.burnmydread.bolivar.tests

import geb.spock.GebReportingSpec
import org.burnmydread.bolivar.pageobjects.Login
import org.burnmydread.bolivar.pageobjects.bluesteel.BlueSteelTeams
import org.burnmydread.bolivar.pageobjects.cjoc.BlueSteelCreateTeam
import org.burnmydread.bolivar.pageobjects.cjoc.BuildAnalytics
import org.burnmydread.bolivar.pageobjects.cjoc.MastersTab

/**
 * Created by zach on 6/15/17.
 */
class CreateNewTeamTestOldWorkFlow extends GebReportingSpec {

    static team_name = System.properties.'bolivar.team_name' ?: 'bolivia'

    def loginAndCreateNewTeam(){
        when:
            to Login
        then:
            at Login
        when:
            username_textbox = Login.correct_username
            password_textbox = Login.correct_password
            login_button.click()
        then:
            at BuildAnalytics
        when:
            tabs.masters.click()
        then:
            at MastersTab
        when:
            report 'masters tab'
            waitFor(10, 0.01) { side_bar.blue_ocean.present }
            side_bar.blue_ocean.click()
        then:
            report 'blue steel?'
            at BlueSteelTeams
            create_team_button.click()
        when:
            at BlueSteelCreateTeam
            team_name_box = team_name
        then:
            team_name_button.click()
        when:
            sleep(20000)
            to MastersTab
        then:
            at BuildAnalytics
        when:
            tabs.masters.click()
        then:
            at MastersTab
        when:
            side_bar.blue_ocean.click()
        then:
            at BlueSteelTeams
            assert first_team.present
    }
}
