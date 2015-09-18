package patterns.Factory;

import patterns.Factory.parsers.DOM_Parser;
import patterns.Factory.parsers.JDOM_Parser;
import patterns.Factory.parsers.JSON_Parser;
import patterns.Factory.parsers.SAX_Parser;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class ParserBuilderFactory {
    private enum TypeParser {
        DOM, SAX, JSON, JDOM
    }

    public static ArrayList<?> getParser(String typeParser) throws IOException, ParseException {
        TypeParser type = TypeParser.valueOf(typeParser.toUpperCase());
        switch (type) {
            case DOM:
                return new DOM_Parser().parser();
            case JDOM:
                return new JDOM_Parser().parser();
            case JSON:
                return new JSON_Parser().parser();
            case SAX:
                return new SAX_Parser().parser();
            default:
                throw new EnumConstantNotPresentException(type.getDeclaringClass(),
                        type.name());
        }
    }
}