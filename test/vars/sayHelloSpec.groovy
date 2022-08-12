import com.homeaway.devtools.jenkins.testing.JenkinsPipelineSpecification

public class sayHelloSpec extends JenkinsPipelineSpecification {

    def "sayHello returns expected value" () {
        def sayHello = null

        setup:
            sayHello = loadPipelineScriptForTest("vars/sayHello.groovy")
            // Stub the sh step to return Hello
            getPipelineMock("sh")(_) >> {
                return "Hello"
            }

        when:
            def msg = sayHello()

        then:
            msg == "Hello World"
    }

}
