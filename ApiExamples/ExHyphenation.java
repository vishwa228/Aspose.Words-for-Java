//////////////////////////////////////////////////////////////////////////
// Copyright (c) 2001-2018 Aspose Pty Ltd. All Rights Reserved.
//
// This file is part of Aspose.Words. The source code in this file
// is only intended as a supplement to the documentation, and is provided
// "as is", without warranty of any kind, either expressed or implied.
//////////////////////////////////////////////////////////////////////////
package Examples;

import org.testng.annotations.Test;
import com.aspose.words.Document;
import com.aspose.words.Hyphenation;

import java.io.FileInputStream;
import java.io.InputStream;


@Test
public class ExHyphenation extends ApiExampleBase
{
    @Test
    public void registerDictionaryEx() throws Exception
    {
        //ExStart
        //ExFor:Hyphenation.RegisterDictionary(String, Stream)
        //ExFor:Hyphenation.RegisterDictionary(String, String)
        //ExSummary:Shows how to open and register a dictionary from a file.
        Document doc = new Document(getMyDir() + "Document.doc");

        // Register by String
        Hyphenation.registerDictionary("en-US", getMyDir() + "hyph_en_US.dic");

        // Register by stream
        InputStream dictionaryStream = new FileInputStream(getMyDir() + "hyph_de_CH.dic");
        Hyphenation.registerDictionary("de-CH", dictionaryStream);
        //ExEnd
    }

    @Test
    public void isDictionaryRegisteredEx() throws Exception
    {
        //ExStart
        //ExFor:Hyphenation.IsDictionaryRegistered(String)
        //ExSummary:Shows how to open check if some dictionary is registered.
        Document doc = new Document(getMyDir() + "Document.doc");
        Hyphenation.registerDictionary("en-US", getMyDir() + "hyph_en_US.dic");

        System.out.println(Hyphenation.isDictionaryRegistered("en-US")); // True
        //ExEnd
    }

    @Test
    public void unregisterDictionaryEx() throws Exception
    {
        //ExStart
        //ExFor:Hyphenation.UnregisterDictionary(String)
        //ExSummary:Shows how to un-register a dictionary
        Document doc = new Document(getMyDir() + "Document.doc");
        Hyphenation.registerDictionary("en-US", getMyDir() + "hyph_en_US.dic");

        Hyphenation.unregisterDictionary("en-US");

        System.out.println(Hyphenation.isDictionaryRegistered("en-US")); // False
        //ExEnd
    }
}
