package ch.heigvd.res.stpatrick;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


class ARemoverStreamProcessor implements IStreamProcessorsFactory {

    Reader decorateReader(Reader inputReader) {
        BufferedReader br = new BufferedReader(inputReader);
        int c = br.read();
        while (c != -1) {
            c = br.read();
        }
        bw.flush();
    }

    Writer decorateWriter(Writer outputWriter) {
        BufferedWriter bw = new BufferedWriter(outputWriter);
        int c = br.read();
        while (c != -1) {
            if(c.toLowerCase() != 'a') {
                c = br.read();
            }
        }
        bw.flush();
    }

}
