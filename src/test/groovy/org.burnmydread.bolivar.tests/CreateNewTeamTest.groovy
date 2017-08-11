package org.burnmydread.bolivar.tests

import geb.spock.GebReportingSpec
import geb.spock.GebSpec
import org.burnmydread.bolivar.pageobjects.Login
import org.burnmydread.bolivar.pageobjects.ManagedMaster.ManagedMasterManageScreen
import org.burnmydread.bolivar.pageobjects.cjoc.BlueSteelCreateTeam
import org.burnmydread.bolivar.pageobjects.bluesteel.BlueSteelTeams
import org.burnmydread.bolivar.pageobjects.cjoc.BuildAnalytics
import org.burnmydread.bolivar.pageobjects.cjoc.MastersTab

/**
 * Created by zach on 6/15/17.
 */
class CreateNewTeamTest extends GebReportingSpec {

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
            ancor_team_icon.click()
        then:
            icon_select.click()
            create_team_button.click()
        when:
            sleep(10000)
            to MastersTab
        then:
            at MastersTab
        when:
            waitFor (120, 1) { created_team.team.present }
            created_team.manage.click()
        then:
            at ManagedMasterManageScreen

    }
}
