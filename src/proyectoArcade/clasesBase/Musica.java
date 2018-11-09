package proyectoArcade.clasesBase;

import java.io.*;
import sun.audio.*;

public class Musica {
  public void Musica(String cancion) throws Exception
  {
    String nombreMusica = cancion;
    InputStream in = new FileInputStream(nombreMusica);

    AudioStream audioStream = new AudioStream(in);

    AudioPlayer.player.start(audioStream);
  }
  //Ejemplo, siempre hay que poner el src/Musica ya que es esa la carpeta
  public static void main(String[] args) throws Exception {
	  Musica m = new Musica();
	m.Musica("src/musica/boom_tetris_for_jeff.wav");
  }	
}
