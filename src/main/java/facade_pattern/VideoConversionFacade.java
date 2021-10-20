package facade_pattern;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        ICodec sourceCodec = CodecFactory.extract(file);
        ICodec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new OggCodec();
        } else {
            destinationCodec = new Mp4Codec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}

