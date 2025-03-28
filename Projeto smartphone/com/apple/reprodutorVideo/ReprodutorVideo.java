package com.apple.reprodutorVideo;
import  video.Video;
public interface ReprodutorVideo {
    public void verVideo(int id);
    public void pausarVideo(int id);
    public void adicionarVideo(Video video);
    public void removerVideo(int id);
    public void listarVideos();
}
