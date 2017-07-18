package org.burnmydread.bolivar.pageobjects.cjoc

import geb.Page

/**
 * Created by zach on 7/17/17.
 */
class EnterLicense extends Page {
    static at = {
        waitFor(60,0.25) { page_title.present }
        waitFor(10,0.1) { directions.present }
        waitFor(10,0.1) { instance_id.present }
        waitFor(10,0.1) { license_key_label.present }
        waitFor(10,0.1) { license_key.present }
        waitFor(10,0.1) { license_cert_label.present }
        waitFor(10,0.1) { license_cert.present }
        waitFor(10,0.1) { accept_terms.present }
        waitFor(10,0.1) { submit.present }
        waitFor(10,0.1) { back.present }
    }

    static content = {
        page_title { $('#main-panel > div > div > div > div > div > div.modal-header > h4') }
        directions { $('#main-panel > div > div > div > div > div > div.modal-body > div > form > div > div:nth-child(1) > div') }
        instance_id { $('#main-panel > div > div > div > div > div > div.modal-body > div > form > div > div:nth-child(1) > div > pre') }
        license_key_label { $('#main-panel > div > div > div > div > div > div.modal-body > div > form > div > div:nth-child(2) > div:nth-child(2) > label') }
        license_key { $('#key-frm-com_cloudbees_jenkins_plugins_license_ManualRegistrar') }
        license_cert_label { $('#main-panel > div > div > div > div > div > div.modal-body > div > form > div > div:nth-child(2) > div:nth-child(3) > label') }
        license_cert { $('#cert-frm-com_cloudbees_jenkins_plugins_license_ManualRegistrar') }
        accept_terms { $('#main-panel > div > div > div > div > div > div.modal-body > div > form > div > div:nth-child(2) > div.form-group.checkbox > label > input') }
        submit { $('#main-panel > div > div > div > div > div > div.modal-footer.cb-registration-form > button.btn.btn-primary.pull-right') }
        back { $('#main-panel > div > div > div > div > div > div.modal-footer.cb-registration-form > button.btn.btn-link.install-home') }
    }
}
