package org.burnmydread.bolivar.tests

import org.burnmydread.bolivar.pageobjects.Login
import geb.spock.GebSpec
import org.burnmydread.bolivar.pageobjects.cjoc.MastersTab

/**
 * Created by zach on 5/18/17.
 */
class LoginTest extends GebSpec {
    def welcomeToJenkins() {
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
    }
}
