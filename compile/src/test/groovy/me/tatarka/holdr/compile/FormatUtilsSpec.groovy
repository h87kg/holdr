package me.tatarka.holdr.compile

import me.tatarka.holdr.compile.util.FormatUtils;
import spock.lang.Specification

import static FormatUtils.underscoreToLowerCamel
import static FormatUtils.underscoreToUpperCamel;

class FormatUtilsSpec extends Specification {
    def "underscore to upper camel"() {
        expect:
        underscoreToUpperCamel(input) == output

        where:
        input           | output
        null            | null
        ""              | ""
        "_"             | ""
        "oneword"       | "Oneword"
        "two_words"     | "TwoWords"
        "_underscores_" | "Underscores"
    }

    def "underscore to lower camel"() {
        expect:
        underscoreToLowerCamel(input) == output

        where:
        input           | output
        null            | null
        ""              | ""
        "_"             | ""
        "oneword"       | "oneword"
        "two_words"     | "twoWords"
        "_underscores_" | "underscores"
    }
}
