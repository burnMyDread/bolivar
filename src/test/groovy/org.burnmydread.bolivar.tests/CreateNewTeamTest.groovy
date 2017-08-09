package org.burnmydread.bolivar.tests

import geb.spock.GebSpec
import org.burnmydread.bolivar.pageobjects.Login
import org.burnmydread.bolivar.pageobjects.cjoc.BlueSteelCreateTeam
import org.burnmydread.bolivar.pageobjects.bluesteel.BlueSteelTeams
import org.burnmydread.bolivar.pageobjects.cjoc.BuildAnalytics
import org.burnmydread.bolivar.pageobjects.cjoc.MastersTab

/**
 * Created by zach on 6/15/17.
 */
class CreateNewTeamTest extends GebSpec {

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
            side_bar.blue_ocean.click()
        then:
            at BlueSteelTeams
            create_team_button.click()
        when:
            at BlueSteelCreateTeam
            team_name_box = team_name
        then:
            create_team_button.click()
        when:
            sleep(10000)
            to MastersTab
        then:
            at MastersTab
        when:
            side_bar.blue_ocean.click()
        then:
            at BlueSteelTeams
            assert first_team.present
    }
}
