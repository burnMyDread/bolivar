package org.burnmydread.bolivar.pageobjects

import geb.Page

/**
 * Created by zach on 5/18/17.
 */
class Login extends  Page{
    static correct_password = System.properties.'bolivar.password'
    static correct_username = System.properties.'bolivar.username'

    static url = System.properties.'bolivar.url'
    static at = {
        waitFor(60,   0.25) { jenkins_nav_bar.present }
        waitFor(10, 0.01)  { username_label.present }
        waitFor(10, 0.01)  { username_textbox.present }
        waitFor(10, 0.01)  { password_label.present }
        waitFor(10, 0.01)  { password_textbox.present }
        waitFor(10, 0.01)  { login_button.present }
    }

    static content = {
        jenkins_nav_bar  { $(".model-link")}
        username_label  { $("#main-panel > div:nth-child(2) > form:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1)")}
        username_textbox  { $("#j_username")}
        password_label  { $("#main-panel > div:nth-child(2) > form:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)")}
        password_textbox  { $("#main-panel > div:nth-child(2) > form:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(2) > input:nth-child(1)")}
        login_button  { $("#yui-gen1-button")}
    }


}
