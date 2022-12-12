def buildApp() {
    echo 'building the application...'
	echo 'building version ${params.VERSION} %date% %time%"
}

def testApp() {
    echo 'testing the application...'
}
def deployApp() {
    echo 'deploying the application...'
	echo 'deploying version ${params.VERSION} %date% %time%"
}

return this
