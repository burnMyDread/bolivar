package org.burnmydread.bolivar.pageobjects.bluesteel

import geb.Page

/**
 * Created by zach on 8/12/17.
 */
class PipelineCreationWizard extends Page {
    static at ={
        waitFor(60,0.25) {git.present}
        waitFor(10,0.01) {git_hub.present}
    }
    static content = {
        git { $('#outer > div > main > article > div.vertical-step-component.complete.first-step > div.step-content > div > div:nth-child(1) > div > button > div') }
        git_directions { $('#outer > div > main > article > div.sandbox-component > div > div.vertical-step-component.active.git-step-connect > div.step-content > div > h1') }
        git_repo_url { $('#outer > div > main > article > div.sandbox-component > div > div.vertical-step-component.active.git-step-connect > div.step-content > div > fieldset > div:nth-child(2) > div.FormElement-children > div > input') }
        git_credintials { $('#outer > div > main > article > div.sandbox-component > div > div.vertical-step-component.active.git-step-connect > div.step-content > div > fieldset > div:nth-child(3) > div.FormElement-children > div > button') }
        git_credintials_add { $('#outer > div > main > article > div.sandbox-component > div > div.vertical-step-component.active.git-step-connect > div.step-content > div > fieldset > div:nth-child(3) > div.FormElement-children > button') }
        git_create_pipeline { $('#outer > div > main > article > div.sandbox-component > div > div.vertical-step-component.active.git-step-connect > div.step-content > div > fieldset > button') }

        git_hub { $('#outer > div > main > article > div.vertical-step-component.complete.first-step > div.step-content > div > div:nth-child(2) > button > div') }

    }
}
