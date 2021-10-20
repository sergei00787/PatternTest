package facade_pattern;

public class CodecFactory {
    public static ICodec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new Mp4Codec();
        } else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCodec();
        }
    }
}

