package org.burnmydread.bolivar.tests.setup

import geb.spock.GebReportingSpec
import geb.spock.GebSpec
import org.burnmydread.bolivar.pageobjects.Login
import org.burnmydread.bolivar.pageobjects.cjoc.EnterLicense
import org.burnmydread.bolivar.pageobjects.cjoc.LicenseLandingPage
import org.burnmydread.bolivar.pageobjects.cjoc.MastersTab
import org.burnmydread.bolivar.pageobjects.shared.InstallPlugins
import org.burnmydread.bolivar.pageobjects.utils.EncryptionDomainObject
import org.burnmydread.bolivar.pageobjects.utils.EncryptionUtil

/**
 * Created by zach on 7/17/17.
 */
class InstallLicenseKey extends GebReportingSpec {

    static final decryptionkey = System.properties.'bolivar.decryptionkey'
    static final encrypted_key = new File(System.properties.'bolivar.keypath').text
    static final encrypted_cert = new File(System.properties.'bolivar.keycert').text

    def installLicense() {
        when:
            to Login
        then:
            at Login
        when:
            username_textbox = Login.correct_username
            password_textbox = Login.correct_password
            login_button.click()
        then:
            at LicenseLandingPage
        when:
            enter_license.click()
        then:
            at EnterLicense
        when:
            def encryptionSettings = new EncryptionDomainObject(algorithm: 'AES', secretKeyText: decryptionkey)
            license_key = EncryptionUtil.decrypt(encrypted_key, encryptionSettings)
            license_cert = EncryptionUtil.decrypt(encrypted_cert, encryptionSettings)
            accept_terms.click()
            submit.click()
        then:
            at InstallPlugins
        when:
            sleep(5 * 1000)
            sugested_plugins.click()
        then:
            waitFor(360, 0.5) {continue_button.present}
        when:
            continue_button.click()
        then:
            at MastersTab
    }
}
