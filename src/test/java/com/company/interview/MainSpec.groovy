package com.company.interview

import spock.lang.Specification

class MainSpec extends Specification {

    def "test test"() {
        when:
        def test = Main.test()

        then:
        test.size() > 0
        test == "TEST"
    }
}
