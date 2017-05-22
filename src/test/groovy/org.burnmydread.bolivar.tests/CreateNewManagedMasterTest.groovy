package org.burnmydread.bolivar.tests

import geb.spock.GebSpec
import org.burnmydread.bolivar.pageobjects.Login
import org.burnmydread.bolivar.pageobjects.cjoc.MastersTab

/**
 * Created by zach on 5/18/17.
 */
class CreateNewManagedMasterTest extends GebSpec {
    def createNewManagedMaster() {
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
            new_master_button.click()
        then:
            waitFor(60, 0.2) { new_master_textarea.present }
            waitFor(10, 0.1) { new_master_label.present }
        when:
            new_master_textarea = 'bolivia'
            new_master_label.click()
        then:
            waitFor(20, 0.1) { create_new_master_button.present }
        when:
            create_new_master_button.click()
        then:
            assert true
    }
}
