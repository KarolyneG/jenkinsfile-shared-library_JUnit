import com.homeaway.devtools.jenkins.testing.JenkinsPipelineSpecification

public class sayHelloSpec extends JenkinsPipelineSpecification {

    def "helloMundo returns expected value" () {
        def helloMundo = null

        setup:
            helloMundo = loadPipelineScriptForTest("vars/helloMundo.groovy")
            // Stub the sh step to return Hello
            getPipelineMock("sh")(_) >> {
                return "Hello"
            }

        when:
            def msg = helloMundo()

        then:
            msg == "Hello World"
    }

}
