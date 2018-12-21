package proyectoArcade.PacMan;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import proyectoArcade.clasesBase.PiezaoPersonaje;
import proyectoArcade.clasesBase.Tablero;
import proyectoArcade.ventana.VentanaScore;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JPanel;

public class VentanaPM extends JFrame {//Para encontrar una ve ya terminada la creacion del mapa buscar el main o //Empieza aqui
	//Todas las piezas, no he encontrado manera de hacerlo desde un array y y crear las piezas por separado
		//"Personajes"
	static PiezaoPersonaje PM = new PiezaoPersonaje(14, 14, "PM");
	static PiezaoPersonaje Fr = new PiezaoPersonaje(1, 1, "Fr");
	static PiezaoPersonaje Fa = new PiezaoPersonaje(1, 28, "Fa");
	static PiezaoPersonaje C = new PiezaoPersonaje(25, 15, "C");
		//Muros 1ra columna
	static PiezaoPersonaje M1 = new PiezaoPersonaje(0, 0, "M1");
	static PiezaoPersonaje M2 = new PiezaoPersonaje(0, 1, "M2");
	static PiezaoPersonaje M3 = new PiezaoPersonaje(0, 2, "M3");
	static PiezaoPersonaje M4 = new PiezaoPersonaje(0, 3, "M4");
	static PiezaoPersonaje M5 = new PiezaoPersonaje(0, 4, "M5");
	static PiezaoPersonaje M6 = new PiezaoPersonaje(0, 5, "M6");
	static PiezaoPersonaje M7 = new PiezaoPersonaje(0, 6, "M7");
	static PiezaoPersonaje M8 = new PiezaoPersonaje(0, 7, "M8");
	static PiezaoPersonaje M9 = new PiezaoPersonaje(0, 8, "M9");
	static PiezaoPersonaje M10 = new PiezaoPersonaje(0, 9, "M10");
	static PiezaoPersonaje M11 = new PiezaoPersonaje(0, 10, "M11");
	static PiezaoPersonaje M12 = new PiezaoPersonaje(0, 11, "M12");
	static PiezaoPersonaje M13 = new PiezaoPersonaje(0, 12, "M13");
	static PiezaoPersonaje M14 = new PiezaoPersonaje(0, 13, "M14");
	static PiezaoPersonaje M15 = new PiezaoPersonaje(0, 14, "M15");
	static PiezaoPersonaje M61 = new PiezaoPersonaje(0, 15, "M60");
	static PiezaoPersonaje M17 = new PiezaoPersonaje(0, 16, "M16");
	static PiezaoPersonaje M18 = new PiezaoPersonaje(0, 17, "M17");
	static PiezaoPersonaje M19 = new PiezaoPersonaje(0, 18, "M18");
	static PiezaoPersonaje M20 = new PiezaoPersonaje(0, 19, "M19");
	static PiezaoPersonaje M21 = new PiezaoPersonaje(0, 20, "M20");
	static PiezaoPersonaje M22 = new PiezaoPersonaje(0, 21, "M21");
	static PiezaoPersonaje M23 = new PiezaoPersonaje(0, 22, "M22");
	static PiezaoPersonaje M24 = new PiezaoPersonaje(0, 23, "M23");
	static PiezaoPersonaje M25 = new PiezaoPersonaje(0, 24, "M24");
	static PiezaoPersonaje M26 = new PiezaoPersonaje(0, 25, "M25");
	static PiezaoPersonaje M27 = new PiezaoPersonaje(0, 26, "M26");
	static PiezaoPersonaje M28 = new PiezaoPersonaje(0, 27, "M27");
	static PiezaoPersonaje M29 = new PiezaoPersonaje(0, 28, "M28");
	static PiezaoPersonaje M30 = new PiezaoPersonaje(0, 29, "M29");
		//Muros ultima columna
	static PiezaoPersonaje M31 = new PiezaoPersonaje(29, 0, "M30");
	static PiezaoPersonaje M32 = new PiezaoPersonaje(29, 1, "M31");
	static PiezaoPersonaje M33 = new PiezaoPersonaje(29, 2, "M32");
	static PiezaoPersonaje M34 = new PiezaoPersonaje(29, 3, "M33");
	static PiezaoPersonaje M35 = new PiezaoPersonaje(29, 4, "M34");
	static PiezaoPersonaje M36 = new PiezaoPersonaje(29, 5, "M35");
	static PiezaoPersonaje M37 = new PiezaoPersonaje(29, 6, "M36");
	static PiezaoPersonaje M38 = new PiezaoPersonaje(29, 7, "M37");
	static PiezaoPersonaje M39 = new PiezaoPersonaje(29, 8, "M38");
	static PiezaoPersonaje M40 = new PiezaoPersonaje(29, 9, "M39");
	static PiezaoPersonaje M41 = new PiezaoPersonaje(29, 10, "M40");
	static PiezaoPersonaje M42 = new PiezaoPersonaje(29, 11, "M41");
	static PiezaoPersonaje M43 = new PiezaoPersonaje(29, 12, "M42");
	static PiezaoPersonaje M44 = new PiezaoPersonaje(29, 13, "M43");
	static PiezaoPersonaje M45 = new PiezaoPersonaje(29, 14, "M44");
	static PiezaoPersonaje M46 = new PiezaoPersonaje(29, 15, "M45");
	static PiezaoPersonaje M47 = new PiezaoPersonaje(29, 16, "M46");
	static PiezaoPersonaje M48 = new PiezaoPersonaje(29, 17, "M47");
	static PiezaoPersonaje M49 = new PiezaoPersonaje(29, 18, "M48");
	static PiezaoPersonaje M50 = new PiezaoPersonaje(29, 19, "M49");
	static PiezaoPersonaje M51 = new PiezaoPersonaje(29, 20, "M50");
	static PiezaoPersonaje M52 = new PiezaoPersonaje(29, 21, "M51");
	static PiezaoPersonaje M53 = new PiezaoPersonaje(29, 22, "M52");
	static PiezaoPersonaje M54 = new PiezaoPersonaje(29, 23, "M53");
	static PiezaoPersonaje M55 = new PiezaoPersonaje(29, 24, "M54");
	static PiezaoPersonaje M56 = new PiezaoPersonaje(29, 25, "M55");
	static PiezaoPersonaje M57 = new PiezaoPersonaje(29, 26, "M56");
	static PiezaoPersonaje M58 = new PiezaoPersonaje(29, 27, "M57");
	static PiezaoPersonaje M59 = new PiezaoPersonaje(29, 28, "M58");
	static PiezaoPersonaje M60 = new PiezaoPersonaje(29, 29, "M59");
		//Muros primera fila
	static PiezaoPersonaje M62 = new PiezaoPersonaje(1, 0, "M61");
	static PiezaoPersonaje M63 = new PiezaoPersonaje(2, 0, "M62");
	static PiezaoPersonaje M67 = new PiezaoPersonaje(3, 0, "M63");
	static PiezaoPersonaje M68 = new PiezaoPersonaje(4, 0, "M64");
	static PiezaoPersonaje M69 = new PiezaoPersonaje(5, 0, "M65");
	static PiezaoPersonaje M70 = new PiezaoPersonaje(6, 0, "M66");
	static PiezaoPersonaje M71 = new PiezaoPersonaje(7, 0, "M67");
	static PiezaoPersonaje M72 = new PiezaoPersonaje(8, 0, "M68");
	static PiezaoPersonaje M73 = new PiezaoPersonaje(9, 0, "M69");
	static PiezaoPersonaje M74 = new PiezaoPersonaje(10, 0, "M70");
	static PiezaoPersonaje M75 = new PiezaoPersonaje(11, 0, "M71");
	static PiezaoPersonaje M76 = new PiezaoPersonaje(12, 0, "M72");
	static PiezaoPersonaje M77 = new PiezaoPersonaje(13, 0, "M73");
	static PiezaoPersonaje M78 = new PiezaoPersonaje(14, 0, "M74");
	static PiezaoPersonaje M79 = new PiezaoPersonaje(15, 0, "M75");
	static PiezaoPersonaje M80 = new PiezaoPersonaje(16, 0, "M76");
	static PiezaoPersonaje M81 = new PiezaoPersonaje(17, 0, "M77");
	static PiezaoPersonaje M82 = new PiezaoPersonaje(18, 0, "M78");
	static PiezaoPersonaje M83 = new PiezaoPersonaje(19, 0, "M79");
	static PiezaoPersonaje M84 = new PiezaoPersonaje(20, 0, "M80");
	static PiezaoPersonaje M85 = new PiezaoPersonaje(21, 0, "M81");
	static PiezaoPersonaje M86 = new PiezaoPersonaje(22, 0, "M82");
	static PiezaoPersonaje M87 = new PiezaoPersonaje(23, 0, "M83");
	static PiezaoPersonaje M88 = new PiezaoPersonaje(24, 0, "M84");
	static PiezaoPersonaje M89 = new PiezaoPersonaje(25, 0, "M85");
	static PiezaoPersonaje M90 = new PiezaoPersonaje(26, 0, "M86");
	static PiezaoPersonaje M91 = new PiezaoPersonaje(27, 0, "M87");
	static PiezaoPersonaje M92 = new PiezaoPersonaje(28, 0, "M88");
		//Muros ultima fila
	static PiezaoPersonaje M93 = new PiezaoPersonaje(1, 29, "M93");
	static PiezaoPersonaje M94 = new PiezaoPersonaje(2, 29, "M94");
	static PiezaoPersonaje M95 = new PiezaoPersonaje(3, 29, "M95");
	static PiezaoPersonaje M96 = new PiezaoPersonaje(4, 29, "M96");
	static PiezaoPersonaje M97 = new PiezaoPersonaje(5, 29, "M97");
	static PiezaoPersonaje M98 = new PiezaoPersonaje(6, 29, "M98");
	static PiezaoPersonaje M99 = new PiezaoPersonaje(7, 29, "M99");
	static PiezaoPersonaje M100 = new PiezaoPersonaje(8, 29, "M100");
	static PiezaoPersonaje M101 = new PiezaoPersonaje(9, 29, "M101");
	static PiezaoPersonaje M102 = new PiezaoPersonaje(10, 29, "M102");
	static PiezaoPersonaje M103 = new PiezaoPersonaje(11, 29, "M103");
	static PiezaoPersonaje M104 = new PiezaoPersonaje(12, 29, "M104");
	static PiezaoPersonaje M105 = new PiezaoPersonaje(13, 29, "M105");
	static PiezaoPersonaje M106 = new PiezaoPersonaje(14, 29, "M106");
	static PiezaoPersonaje M107 = new PiezaoPersonaje(15, 29, "M107");
	static PiezaoPersonaje M108 = new PiezaoPersonaje(16, 29, "M108");
	static PiezaoPersonaje M109 = new PiezaoPersonaje(17, 29, "M109");
	static PiezaoPersonaje M110 = new PiezaoPersonaje(18, 29, "M110");
	static PiezaoPersonaje M111 = new PiezaoPersonaje(19, 29, "M111");
	static PiezaoPersonaje M112 = new PiezaoPersonaje(20, 29, "M112");
	static PiezaoPersonaje M113 = new PiezaoPersonaje(21, 29, "M113");
	static PiezaoPersonaje M114 = new PiezaoPersonaje(22, 29, "M114");
	static PiezaoPersonaje M115 = new PiezaoPersonaje(23, 29, "M115");
	static PiezaoPersonaje M116 = new PiezaoPersonaje(24, 29, "M116");
	static PiezaoPersonaje M117 = new PiezaoPersonaje(25, 29, "M117");
	static PiezaoPersonaje M118 = new PiezaoPersonaje(26, 29, "M118");
	static PiezaoPersonaje M119 = new PiezaoPersonaje(27, 29, "M119");
	static PiezaoPersonaje M120 = new PiezaoPersonaje(28, 29, "M120");
		//Muros 3ra columna
	static PiezaoPersonaje M121 = new PiezaoPersonaje(2, 2, "M121");
	static PiezaoPersonaje M122 = new PiezaoPersonaje(2, 3, "M122");
	static PiezaoPersonaje M123 = new PiezaoPersonaje(2, 4, "M123");
	static PiezaoPersonaje M124 = new PiezaoPersonaje(2, 6, "M124");
	static PiezaoPersonaje M125 = new PiezaoPersonaje(2, 7, "M125");
	static PiezaoPersonaje M126 = new PiezaoPersonaje(2, 8, "M126");
	static PiezaoPersonaje M127 = new PiezaoPersonaje(2, 10, "127");
	static PiezaoPersonaje M128 = new PiezaoPersonaje(2, 11, "M128");
	static PiezaoPersonaje M129 = new PiezaoPersonaje(2, 12, "M129");
	static PiezaoPersonaje M130 = new PiezaoPersonaje(2, 14, "M130");
	static PiezaoPersonaje M131 = new PiezaoPersonaje(2, 15, "M131");
	static PiezaoPersonaje M132 = new PiezaoPersonaje(2, 16, "M132");
	static PiezaoPersonaje M133 = new PiezaoPersonaje(2, 18, "M133");
	static PiezaoPersonaje M134 = new PiezaoPersonaje(2, 19, "M134");
	static PiezaoPersonaje M135 = new PiezaoPersonaje(2, 20, "M135");
	static PiezaoPersonaje M136 = new PiezaoPersonaje(2, 22, "M136");
	static PiezaoPersonaje M137 = new PiezaoPersonaje(2, 23, "M137");
	static PiezaoPersonaje M138 = new PiezaoPersonaje(2, 25, "M138");
	static PiezaoPersonaje M139 = new PiezaoPersonaje(2, 26, "M139");
	static PiezaoPersonaje M140 = new PiezaoPersonaje(2, 27, "M140");
		//Muros 4ta columna
	static PiezaoPersonaje M141 = new PiezaoPersonaje(3, 2, "M141");
	static PiezaoPersonaje M142 = new PiezaoPersonaje(3, 6, "M142");
	static PiezaoPersonaje M143 = new PiezaoPersonaje(3, 7, "M143");
	static PiezaoPersonaje M144 = new PiezaoPersonaje(3, 8, "M144");
	static PiezaoPersonaje M145 = new PiezaoPersonaje(3, 10, "M145");
	static PiezaoPersonaje M146 = new PiezaoPersonaje(3, 11, "M146");
	static PiezaoPersonaje M147 = new PiezaoPersonaje(3, 12, "M147");
	static PiezaoPersonaje M148 = new PiezaoPersonaje(3, 14, "M148");
	static PiezaoPersonaje M149 = new PiezaoPersonaje(3, 15, "M149");
	static PiezaoPersonaje M150 = new PiezaoPersonaje(3, 16, "M150");
	static PiezaoPersonaje M151 = new PiezaoPersonaje(3, 18, "M151");
	static PiezaoPersonaje M152 = new PiezaoPersonaje(3, 19, "M152");
	static PiezaoPersonaje M153 = new PiezaoPersonaje(3, 20, "M153");
	static PiezaoPersonaje M154 = new PiezaoPersonaje(3, 22, "M154");
	static PiezaoPersonaje M155 = new PiezaoPersonaje(3, 23, "M155");
	static PiezaoPersonaje M156 = new PiezaoPersonaje(3, 27, "M156");
		//Muros 5ta columna
	static PiezaoPersonaje M157 = new PiezaoPersonaje(4, 2, "M157");
	static PiezaoPersonaje M158 = new PiezaoPersonaje(4, 4, "M158");
	static PiezaoPersonaje M159 = new PiezaoPersonaje(4, 6, "M159");
	static PiezaoPersonaje M160 = new PiezaoPersonaje(4, 7, "M160");
	static PiezaoPersonaje M161 = new PiezaoPersonaje(4, 8, "M161");
	static PiezaoPersonaje M162 = new PiezaoPersonaje(4, 10, "M162");
	static PiezaoPersonaje M163 = new PiezaoPersonaje(4, 11, "M163");
	static PiezaoPersonaje M164 = new PiezaoPersonaje(4, 12, "M164");
	static PiezaoPersonaje M165 = new PiezaoPersonaje(4, 14, "M165");
	static PiezaoPersonaje M166 = new PiezaoPersonaje(4, 15, "M166");
	static PiezaoPersonaje M167 = new PiezaoPersonaje(4, 16, "M167");
	static PiezaoPersonaje M168 = new PiezaoPersonaje(4, 18, "M168");
	static PiezaoPersonaje M169 = new PiezaoPersonaje(4, 19, "M169");
	static PiezaoPersonaje M170 = new PiezaoPersonaje(4, 20, "M170");
	static PiezaoPersonaje M171 = new PiezaoPersonaje(4, 22, "M171");
	static PiezaoPersonaje M172 = new PiezaoPersonaje(4, 23, "M172");
	static PiezaoPersonaje M173 = new PiezaoPersonaje(4, 25, "M173");
	static PiezaoPersonaje M174 = new PiezaoPersonaje(4, 27, "M174");
		//Muros 7ta columna
	static PiezaoPersonaje M175 = new PiezaoPersonaje(6, 2, "M175");
	static PiezaoPersonaje M176 = new PiezaoPersonaje(6, 3, "M176");
	static PiezaoPersonaje M177 = new PiezaoPersonaje(6, 4, "M177");
	static PiezaoPersonaje M178 = new PiezaoPersonaje(6, 6, "M178");
	static PiezaoPersonaje M179 = new PiezaoPersonaje(6, 7, "M179");
	static PiezaoPersonaje M180 = new PiezaoPersonaje(6, 8, "M180");
	static PiezaoPersonaje M181 = new PiezaoPersonaje(6, 9, "M181");
	static PiezaoPersonaje M182 = new PiezaoPersonaje(6, 10, "M182");
	static PiezaoPersonaje M183 = new PiezaoPersonaje(6, 11, "M183");
	static PiezaoPersonaje M184 = new PiezaoPersonaje(6, 12, "M184");
	static PiezaoPersonaje M185 = new PiezaoPersonaje(6, 13, "M185");
	static PiezaoPersonaje M186 = new PiezaoPersonaje(6, 15, "M186");
	static PiezaoPersonaje M187 = new PiezaoPersonaje(6, 16, "M187");
	static PiezaoPersonaje M188 = new PiezaoPersonaje(6, 17, "M188");
	static PiezaoPersonaje M189 = new PiezaoPersonaje(6, 18, "M189");
	static PiezaoPersonaje M190 = new PiezaoPersonaje(6, 19, "M190");
	static PiezaoPersonaje M191 = new PiezaoPersonaje(6, 20, "M191");
	static PiezaoPersonaje M192 = new PiezaoPersonaje(6, 21, "M192");
	static PiezaoPersonaje M193 = new PiezaoPersonaje(6, 22, "M193");
	static PiezaoPersonaje M194 = new PiezaoPersonaje(6, 23, "M194");
	static PiezaoPersonaje M195 = new PiezaoPersonaje(6, 25, "M195");
	static PiezaoPersonaje M196 = new PiezaoPersonaje(6, 26, "M196");
	static PiezaoPersonaje M197 = new PiezaoPersonaje(6, 27, "M197");
		//Muros 8va columna
	static PiezaoPersonaje M198 = new PiezaoPersonaje(7, 2, "M198");
	static PiezaoPersonaje M199 = new PiezaoPersonaje(7, 3, "M199");
	static PiezaoPersonaje M200 = new PiezaoPersonaje(7, 4, "M200");
	static PiezaoPersonaje M201 = new PiezaoPersonaje(7, 6, "M201");
	static PiezaoPersonaje M202 = new PiezaoPersonaje(7, 23, "M202");
	static PiezaoPersonaje M203 = new PiezaoPersonaje(7, 25, "M203");
	static PiezaoPersonaje M204 = new PiezaoPersonaje(7, 26, "M204");
	static PiezaoPersonaje M205 = new PiezaoPersonaje(7, 27, "M205");
		//Muros 9na columna
	static PiezaoPersonaje M206 = new PiezaoPersonaje(8, 6, "M206");
	static PiezaoPersonaje M207 = new PiezaoPersonaje(8, 8, "M207");
	static PiezaoPersonaje M208 = new PiezaoPersonaje(8, 9, "M208");
	static PiezaoPersonaje M209 = new PiezaoPersonaje(8, 10, "M209");
	static PiezaoPersonaje M210 = new PiezaoPersonaje(8, 12, "M210");
	static PiezaoPersonaje M211 = new PiezaoPersonaje(8, 13, "M211");
	static PiezaoPersonaje M212 = new PiezaoPersonaje(8, 14, "M212");
	static PiezaoPersonaje M213 = new PiezaoPersonaje(8, 15, "M213");
	static PiezaoPersonaje M214 = new PiezaoPersonaje(8, 16, "M214");
	static PiezaoPersonaje M215 = new PiezaoPersonaje(8, 17, "M215");
	static PiezaoPersonaje M216 = new PiezaoPersonaje(8, 19, "M216");
	static PiezaoPersonaje M217 = new PiezaoPersonaje(8, 20, "M217");
	static PiezaoPersonaje M218 = new PiezaoPersonaje(8, 21, "M218");
	static PiezaoPersonaje M219 = new PiezaoPersonaje(8, 23, "M219");
	static PiezaoPersonaje M220 = new PiezaoPersonaje(8, 25, "M220");
	static PiezaoPersonaje M221 = new PiezaoPersonaje(8, 26, "M221");
	static PiezaoPersonaje M222 = new PiezaoPersonaje(8, 27, "M222");
		//Muros 10ma columna
	static PiezaoPersonaje M223 = new PiezaoPersonaje(9, 2, "M206");
	static PiezaoPersonaje M224 = new PiezaoPersonaje(9, 3, "M207");
	static PiezaoPersonaje M225 = new PiezaoPersonaje(9, 4, "M208");
	static PiezaoPersonaje M226 = new PiezaoPersonaje(9, 6, "M209");
	static PiezaoPersonaje M227 = new PiezaoPersonaje(9, 8, "M210");
	static PiezaoPersonaje M228 = new PiezaoPersonaje(9, 12, "M214");
	static PiezaoPersonaje M229 = new PiezaoPersonaje(9, 13, "M215");
	static PiezaoPersonaje M230 = new PiezaoPersonaje(9, 14, "M216");
	static PiezaoPersonaje M231 = new PiezaoPersonaje(9, 15, "M217");
	static PiezaoPersonaje M232 = new PiezaoPersonaje(9, 16, "M218");
	static PiezaoPersonaje M233 = new PiezaoPersonaje(9, 17, "M219");
	static PiezaoPersonaje M234 = new PiezaoPersonaje(9, 21, "M220");
	
		//Bolas 2nda columna
	static PiezaoPersonaje B1 = new PiezaoPersonaje(1, 2, "B1");
	static PiezaoPersonaje B2 = new PiezaoPersonaje(1, 3, "B2");
	static PiezaoPersonaje B3 = new PiezaoPersonaje(1, 4, "B3");
	static PiezaoPersonaje B4 = new PiezaoPersonaje(1, 5, "B4");
	static PiezaoPersonaje B5 = new PiezaoPersonaje(1, 6, "B5");
	static PiezaoPersonaje B6 = new PiezaoPersonaje(1, 7, "B6");
	static PiezaoPersonaje B7 = new PiezaoPersonaje(1, 8, "B7");
	static PiezaoPersonaje B8 = new PiezaoPersonaje(1, 9, "B8");
	static PiezaoPersonaje B9 = new PiezaoPersonaje(1, 10, "B9");
	static PiezaoPersonaje B10 = new PiezaoPersonaje(1, 11, "B10");
	static PiezaoPersonaje B11 = new PiezaoPersonaje(1, 12, "B11");
	static PiezaoPersonaje B12 = new PiezaoPersonaje(1, 13, "B12");
	static PiezaoPersonaje B13 = new PiezaoPersonaje(1, 14, "B13");
	static PiezaoPersonaje B14 = new PiezaoPersonaje(1, 15, "B14");
	static PiezaoPersonaje B15 = new PiezaoPersonaje(1, 16, "B15");
	static PiezaoPersonaje B16 = new PiezaoPersonaje(1, 17, "B16");
	static PiezaoPersonaje B17 = new PiezaoPersonaje(1, 18, "B17");
	static PiezaoPersonaje B18 = new PiezaoPersonaje(1, 19, "B18");
	static PiezaoPersonaje B19 = new PiezaoPersonaje(1, 20, "B19");
	static PiezaoPersonaje B20 = new PiezaoPersonaje(1, 21, "B20");
	static PiezaoPersonaje B21 = new PiezaoPersonaje(1, 22, "B21");
	static PiezaoPersonaje B22 = new PiezaoPersonaje(1, 23, "B22");
	static PiezaoPersonaje B23 = new PiezaoPersonaje(1, 24, "B23");
	static PiezaoPersonaje B24 = new PiezaoPersonaje(1, 25, "B24");
	static PiezaoPersonaje B25 = new PiezaoPersonaje(1, 26, "B25");
	static PiezaoPersonaje B26 = new PiezaoPersonaje(1, 27, "B26");
		//Personaje
	static JLabel Fantasma1 = new JLabel();
	static JLabel Fantasma2 = new JLabel();
	static JLabel Fantasma3 = new JLabel();
	static JLabel Fantasma4 = new JLabel();
	static JLabel Cereza = new JLabel();
	static JLabel PacMan = new JLabel();
		//Muros
	static JLabel Muro1 = new JLabel();
	static JLabel Muro2 = new JLabel();
	static JLabel Muro3 = new JLabel();
	static JLabel Muro4 = new JLabel();
	static JLabel Muro5 = new JLabel();
	static JLabel Muro6 = new JLabel();
	static JLabel Muro7 = new JLabel();
	static JLabel Muro8 = new JLabel();
	static JLabel Muro9 = new JLabel();
	static JLabel Muro10 = new JLabel();
	static JLabel Muro11 = new JLabel();
	static JLabel Muro12 = new JLabel();
	static JLabel Muro13 = new JLabel();
	static JLabel Muro14 = new JLabel();
	static JLabel Muro61 = new JLabel();
	static JLabel Muro15 = new JLabel();
	static JLabel Muro17 = new JLabel();
	static JLabel Muro18 = new JLabel();
	static JLabel Muro19 = new JLabel();
	static JLabel Muro20 = new JLabel();
	static JLabel Muro21 = new JLabel();
	static JLabel Muro22 = new JLabel();
	static JLabel Muro23 = new JLabel();
	static JLabel Muro24 = new JLabel();
	static JLabel Muro25 = new JLabel();
	static JLabel Muro26 = new JLabel();
	static JLabel Muro27 = new JLabel();
	static JLabel Muro28 = new JLabel();
	static JLabel Muro29 = new JLabel();
	static JLabel Muro30 = new JLabel();
	static JLabel Muro31 = new JLabel();
	static JLabel Muro32 = new JLabel();
	static JLabel Muro33 = new JLabel();
	static JLabel Muro34 = new JLabel();
	static JLabel Muro35 = new JLabel();
	static JLabel Muro36 = new JLabel();
	static JLabel Muro37 = new JLabel();
	static JLabel Muro38 = new JLabel();
	static JLabel Muro39 = new JLabel();
	static JLabel Muro40 = new JLabel();
	static JLabel Muro41 = new JLabel();
	static JLabel Muro42 = new JLabel();
	static JLabel Muro43 = new JLabel();
	static JLabel Muro44 = new JLabel();
	static JLabel Muro45 = new JLabel();
	static JLabel Muro46 = new JLabel();
	static JLabel Muro47 = new JLabel();
	static JLabel Muro48 = new JLabel();
	static JLabel Muro49 = new JLabel();
	static JLabel Muro50 = new JLabel();
	static JLabel Muro51 = new JLabel();
	static JLabel Muro52 = new JLabel();
	static JLabel Muro53 = new JLabel();
	static JLabel Muro54 = new JLabel();
	static JLabel Muro55 = new JLabel();
	static JLabel Muro56 = new JLabel();
	static JLabel Muro57 = new JLabel();
	static JLabel Muro58 = new JLabel();
	static JLabel Muro59 = new JLabel();
	static JLabel Muro60 = new JLabel();
	static JLabel Muro62 = new JLabel();
	static JLabel Muro63 = new JLabel();
//	static JLabel Muro64 = new JLabel();
//	static JLabel Muro65 = new JLabel();
//	static JLabel Muro66 = new JLabel();
	static JLabel Muro67 = new JLabel();
	static JLabel Muro68 = new JLabel();
	static JLabel Muro69 = new JLabel();
	static JLabel Muro70 = new JLabel();
	static JLabel Muro71 = new JLabel();
	static JLabel Muro72 = new JLabel();
	static JLabel Muro73 = new JLabel();
	static JLabel Muro74 = new JLabel();
	static JLabel Muro75 = new JLabel();
	static JLabel Muro76 = new JLabel();
	static JLabel Muro77 = new JLabel();
	static JLabel Muro78 = new JLabel();
	static JLabel Muro79 = new JLabel();
	static JLabel Muro80 = new JLabel();
	static JLabel Muro81 = new JLabel();
	static JLabel Muro82 = new JLabel();
	static JLabel Muro83 = new JLabel();
	static JLabel Muro84 = new JLabel();
	static JLabel Muro85 = new JLabel();
	static JLabel Muro86 = new JLabel();
	static JLabel Muro87 = new JLabel();
	static JLabel Muro88 = new JLabel();
	static JLabel Muro89 = new JLabel();
	static JLabel Muro90 = new JLabel();
	static JLabel Muro91 = new JLabel();
	static JLabel Muro92 = new JLabel();
	static JLabel Muro93 = new JLabel();
	static JLabel Muro94 = new JLabel();
	static JLabel Muro95 = new JLabel();
	static JLabel Muro96 = new JLabel();
	static JLabel Muro97 = new JLabel();
	static JLabel Muro98 = new JLabel();
	static JLabel Muro99 = new JLabel();
	static JLabel Muro100 = new JLabel();
	static JLabel Muro101 = new JLabel();
	static JLabel Muro102 = new JLabel();
	static JLabel Muro103 = new JLabel();
	static JLabel Muro104 = new JLabel();
	static JLabel Muro105 = new JLabel();
	static JLabel Muro106 = new JLabel();
	static JLabel Muro107 = new JLabel();
	static JLabel Muro108 = new JLabel();
	static JLabel Muro109 = new JLabel();
	static JLabel Muro110 = new JLabel();
	static JLabel Muro111 = new JLabel();
	static JLabel Muro112 = new JLabel();
	static JLabel Muro113 = new JLabel();
	static JLabel Muro114 = new JLabel();
	static JLabel Muro115 = new JLabel();
	static JLabel Muro116 = new JLabel();
	static JLabel Muro117 = new JLabel();
	static JLabel Muro118 = new JLabel();
	static JLabel Muro119 = new JLabel();
	static JLabel Muro120 = new JLabel();
	static JLabel Muro121 = new JLabel();
	static JLabel Muro122 = new JLabel();
	static JLabel Muro123 = new JLabel();
	static JLabel Muro124 = new JLabel();
	static JLabel Muro125 = new JLabel();
	static JLabel Muro126 = new JLabel();
	static JLabel Muro127 = new JLabel();
	static JLabel Muro128 = new JLabel();
	static JLabel Muro129 = new JLabel();
	static JLabel Muro130 = new JLabel();
	static JLabel Muro131 = new JLabel();
	static JLabel Muro132 = new JLabel();
	static JLabel Muro133 = new JLabel();
	static JLabel Muro134 = new JLabel();
	static JLabel Muro135 = new JLabel();
	static JLabel Muro136 = new JLabel();
	static JLabel Muro137 = new JLabel();
	static JLabel Muro138 = new JLabel();
	static JLabel Muro139 = new JLabel();
	static JLabel Muro140 = new JLabel();
	static JLabel Muro141 = new JLabel();
	static JLabel Muro142 = new JLabel();
	static JLabel Muro143 = new JLabel();
	static JLabel Muro144 = new JLabel();
	static JLabel Muro145 = new JLabel();
	static JLabel Muro146 = new JLabel();
	static JLabel Muro147 = new JLabel();
	static JLabel Muro148 = new JLabel();
	static JLabel Muro149 = new JLabel();
	static JLabel Muro150 = new JLabel();
	static JLabel Muro151 = new JLabel();
	static JLabel Muro152 = new JLabel();
	static JLabel Muro153 = new JLabel();
	static JLabel Muro154 = new JLabel();
	static JLabel Muro155 = new JLabel();
	static JLabel Muro156 = new JLabel();
	static JLabel Muro157 = new JLabel();
	static JLabel Muro158 = new JLabel();
	static JLabel Muro159 = new JLabel();
	static JLabel Muro160 = new JLabel();
	static JLabel Muro161 = new JLabel();
	static JLabel Muro162 = new JLabel();
	static JLabel Muro163 = new JLabel();
	static JLabel Muro164 = new JLabel();
	static JLabel Muro165 = new JLabel();
	static JLabel Muro166 = new JLabel();
	static JLabel Muro167 = new JLabel();
	static JLabel Muro168 = new JLabel();
	static JLabel Muro169 = new JLabel();
	static JLabel Muro170 = new JLabel();
	static JLabel Muro171 = new JLabel();
	static JLabel Muro172 = new JLabel();
	static JLabel Muro173 = new JLabel();
	static JLabel Muro174 = new JLabel();
	static JLabel Muro175 = new JLabel();
	static JLabel Muro176 = new JLabel();
	static JLabel Muro177 = new JLabel();
	static JLabel Muro178 = new JLabel();
	static JLabel Muro179 = new JLabel();
	static JLabel Muro180 = new JLabel();
	static JLabel Muro181 = new JLabel();
	static JLabel Muro182 = new JLabel();
	static JLabel Muro183 = new JLabel();
	static JLabel Muro184 = new JLabel();
	static JLabel Muro185 = new JLabel();
	static JLabel Muro186 = new JLabel();
	static JLabel Muro187 = new JLabel();
	static JLabel Muro188 = new JLabel();
	static JLabel Muro189 = new JLabel();
	static JLabel Muro190 = new JLabel();
	static JLabel Muro191 = new JLabel();
	static JLabel Muro192 = new JLabel();
	static JLabel Muro193 = new JLabel();
	static JLabel Muro194 = new JLabel();
	static JLabel Muro195 = new JLabel();
	static JLabel Muro196 = new JLabel();
	static JLabel Muro197 = new JLabel();
	static JLabel Muro198 = new JLabel();
	static JLabel Muro199 = new JLabel();
	static JLabel Muro200 = new JLabel();
	static JLabel Muro201 = new JLabel();
	static JLabel Muro202 = new JLabel();
	static JLabel Muro203 = new JLabel();
	static JLabel Muro204 = new JLabel();
	static JLabel Muro205 = new JLabel();
	static JLabel Muro206 = new JLabel();
	static JLabel Muro207 = new JLabel();
	static JLabel Muro208 = new JLabel();
	static JLabel Muro209 = new JLabel();
	static JLabel Muro210 = new JLabel();
	static JLabel Muro211 = new JLabel();
	static JLabel Muro212 = new JLabel();
	static JLabel Muro213 = new JLabel();
	static JLabel Muro214 = new JLabel();
	static JLabel Muro215 = new JLabel();
	static JLabel Muro216 = new JLabel();
	static JLabel Muro217 = new JLabel();
	static JLabel Muro218 = new JLabel();
	static JLabel Muro219 = new JLabel();
	static JLabel Muro220 = new JLabel();
	static JLabel Muro221 = new JLabel();
	static JLabel Muro222 = new JLabel();
	static JLabel Muro223 = new JLabel();
	static JLabel Muro224 = new JLabel();
	static JLabel Muro225 = new JLabel();
	static JLabel Muro226 = new JLabel();
	static JLabel Muro227 = new JLabel();
	static JLabel Muro228 = new JLabel();
	static JLabel Muro229 = new JLabel();
	static JLabel Muro230 = new JLabel();
	static JLabel Muro231 = new JLabel();
	static JLabel Muro232 = new JLabel();
	static JLabel Muro233 = new JLabel();
	static JLabel Muro234 = new JLabel();
		//Bolas
	static JLabel Bola1 = new JLabel();
	static JLabel Bola2 = new JLabel();
	static JLabel Bola3 = new JLabel();
	static JLabel Bola4 = new JLabel();
	static JLabel Bola5 = new JLabel();
	static JLabel Bola6 = new JLabel();
	static JLabel Bola7 = new JLabel();
	static JLabel Bola8 = new JLabel();
	static JLabel Bola9 = new JLabel();
	static JLabel Bola10 = new JLabel();
	static JLabel Bola11 = new JLabel();
	static JLabel Bola12 = new JLabel();
	static JLabel Bola13 = new JLabel();
	static JLabel Bola14 = new JLabel();
	static JLabel Bola15 = new JLabel();
	static JLabel Bola16 = new JLabel();
	static JLabel Bola17 = new JLabel();
	static JLabel Bola18 = new JLabel();
	static JLabel Bola19 = new JLabel();
	static JLabel Bola20 = new JLabel();
	static JLabel Bola21 = new JLabel();
	static JLabel Bola22 = new JLabel();
	static JLabel Bola23 = new JLabel();
	static JLabel Bola24 = new JLabel();
	static JLabel Bola25 = new JLabel();
	static JLabel Bola26 = new JLabel();
	static JLabel Bola27 = new JLabel();
	static JLabel Bola28 = new JLabel();
		//Listas
	static ArrayList<PiezaoPersonaje> listaComidos = new ArrayList<PiezaoPersonaje>();
	static ArrayList<PiezaoPersonaje> objMostrados = new ArrayList<PiezaoPersonaje>();
	static ArrayList<PiezaoPersonaje> cerezasComidas = new ArrayList<PiezaoPersonaje>();
	static ArrayList<PiezaoPersonaje> cerezasVida = new ArrayList<PiezaoPersonaje>();
	static ArrayList<String> direccionesF = new ArrayList<String>();
		//Labels adicionales
	static JLabel vidas;
	static JLabel pts;
		//Strings para inicializar las direcciones
	static String direccion = "derecha";
	static String direccionF1 = "derecha";
	static String direccionF2 = "arriba";
	static String direccionF3 = "izquierda";
	static String direccionF4 = "abajo";
	
	public static String getDireccionF1() {
		return direccionF1;
	}

	public static void setDireccionF1(String direccionF1) {
		VentanaPM.direccionF1 = direccionF1;
	}

	public static String getDireccionF2() {
		return direccionF2;
	}

	public static void setDireccionF2(String direccionF2) {
		VentanaPM.direccionF2 = direccionF2;
	}

	public static String getDireccionF3() {
		return direccionF3;
	}

	public static void setDireccionF3(String direccionF3) {
		VentanaPM.direccionF3 = direccionF3;
	}

	public static String getDireccionF4() {
		return direccionF4;
	}

	public static void setDireccionF4(String direccionF4) {
		VentanaPM.direccionF4 = direccionF4;
	}

	public static void setDireccion(String direccion) {
		VentanaPM.direccion = direccion;
	}

	public static String getDireccion() {
		return direccion;
	}

	public VentanaPM(int anchura, int altura, boolean mute) {
		boolean musica = mute;
	}
//Empieza aqui
	public static void main(int anchura, int altura, boolean mute) {
		vidas = new JLabel("3");
		pts = new JLabel();
		VentanaPM VPM = new VentanaPM(anchura, altura, mute);
		VPM.setTitle("Pac-Man");
		VPM.setSize(anchura, altura);
		VPM.setVisible(true);

		VPM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		PiezaoPersonaje[][] tablero = new PiezaoPersonaje[30][30];
		VPM.getContentPane().setLayout(null);

		vidas.setBounds(800, 10, 30, 30);
		VPM.getContentPane().add(vidas);
		
		pts.setHorizontalAlignment(SwingConstants.TRAILING);
		pts.setBounds(278, 13, 56, 16);
		VPM.getContentPane().add(pts);
		
		direccionesF.add("arriba");		
		direccionesF.add("derecha");
		direccionesF.add("abajo");
		direccionesF.add("izquierda");
	
		Fantasma1.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaRojo.jpg")));
		Fantasma2.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaAmarillo.jpg")));
		PacMan.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/2000px-Pacman.svg.png")));
		Cereza.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/Cereza.jpg")));
			//Muros
		Muro1.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro2.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro3.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro4.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro5.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro6.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro7.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro8.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro9.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro10.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro11.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro12.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro13.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro14.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro61.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro15.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro17.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro18.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro19.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro20.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro21.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro22.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro23.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro24.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro25.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro26.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro27.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro28.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro29.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro30.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro31.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro32.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro33.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro34.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro35.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro36.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro37.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro38.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro39.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro40.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro41.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro42.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro43.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro44.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro45.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro46.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro47.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro48.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro49.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro50.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro51.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro52.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro53.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro54.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro55.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro56.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro57.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro58.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro59.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro60.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro62.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro63.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
//		Muro64.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
//		Muro65.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
//		Muro66.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro67.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro68.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro69.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro70.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro71.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro72.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro73.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro74.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro75.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro76.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro77.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro78.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro79.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro80.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro81.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro82.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro83.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro84.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro85.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro86.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro87.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro88.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro89.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro90.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro91.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro92.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro93.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro94.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro95.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro96.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro97.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro98.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro99.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro100.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro101.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro102.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro103.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro104.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro105.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro106.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro107.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro108.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro109.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro110.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro111.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro112.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro113.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro114.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro115.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro116.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro117.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro118.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro119.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro120.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro121.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro122.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro123.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro124.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro125.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro126.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro127.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro128.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro129.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro130.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro131.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro132.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro133.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro134.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro135.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro136.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro137.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro138.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro139.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro140.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro141.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro142.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro143.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro144.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro145.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro146.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro147.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro148.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro149.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro150.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro151.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro152.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro153.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro154.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro155.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro156.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro157.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro158.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro159.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro160.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro161.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro162.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro163.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro164.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro165.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro166.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro167.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro168.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro169.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro170.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro171.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro172.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro173.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro174.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro175.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro176.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro177.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro178.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro179.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro180.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro181.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro182.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro183.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro184.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro185.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro186.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro187.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro188.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro189.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro190.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro191.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro192.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro193.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro194.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro195.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro196.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro197.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro198.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro199.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro200.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro201.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro202.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro203.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro204.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro205.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro206.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro207.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro208.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro209.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro210.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro211.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro212.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro213.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro214.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro215.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro216.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro217.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro218.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro219.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro220.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro221.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro222.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro223.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro224.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro225.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro226.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro227.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro228.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro229.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro230.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro231.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro232.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro233.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro234.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
			//Bolas
		Bola1.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola2.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola3.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola4.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola5.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola6.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola7.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola8.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola9.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola10.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola11.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola12.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola13.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola14.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola15.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola16.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola17.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola18.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola19.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola20.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola21.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola22.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola23.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola24.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola25.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola26.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola27.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		Bola28.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/BolaPM.png")));
		
		VPM.add(Fantasma1);
		VPM.add(Fantasma2);
		VPM.add(PacMan);
		VPM.add(Cereza);
			//Muros
		VPM.add(Muro1);
		VPM.add(Muro2);
		VPM.add(Muro3);
		VPM.add(Muro4);
		VPM.add(Muro5);
		VPM.add(Muro6);
		VPM.add(Muro7);
		VPM.add(Muro8);
		VPM.add(Muro9);
		VPM.add(Muro10);
		VPM.add(Muro11);
		VPM.add(Muro12);
		VPM.add(Muro13);
		VPM.add(Muro14);
		VPM.add(Muro61);
		VPM.add(Muro15);
		VPM.add(Muro17);
		VPM.add(Muro18);
		VPM.add(Muro19);
		VPM.add(Muro20);
		VPM.add(Muro21);
		VPM.add(Muro22);
		VPM.add(Muro23);
		VPM.add(Muro24);
		VPM.add(Muro25);
		VPM.add(Muro26);
		VPM.add(Muro27);
		VPM.add(Muro28);
		VPM.add(Muro29);
		VPM.add(Muro30);
		VPM.add(Muro31);
		VPM.add(Muro32);
		VPM.add(Muro33);
		VPM.add(Muro34);
		VPM.add(Muro35);
		VPM.add(Muro36);
		VPM.add(Muro37);
		VPM.add(Muro38);
		VPM.add(Muro39);
		VPM.add(Muro40);
		VPM.add(Muro41);
		VPM.add(Muro42);
		VPM.add(Muro43);
		VPM.add(Muro44);
		VPM.add(Muro45);
		VPM.add(Muro46);
		VPM.add(Muro47);
		VPM.add(Muro48);
		VPM.add(Muro49);
		VPM.add(Muro50);
		VPM.add(Muro51);
		VPM.add(Muro52);
		VPM.add(Muro53);
		VPM.add(Muro54);
		VPM.add(Muro55);
		VPM.add(Muro56);
		VPM.add(Muro57);
		VPM.add(Muro58);
		VPM.add(Muro59);
		VPM.add(Muro60);
		VPM.add(Muro62);
		VPM.add(Muro63);
//		VPM.add(Muro64);
//		VPM.add(Muro65);
//		VPM.add(Muro66);
		VPM.add(Muro67);
		VPM.add(Muro68);
		VPM.add(Muro69);
		VPM.add(Muro70);
		VPM.add(Muro71);
		VPM.add(Muro72);
		VPM.add(Muro73);
		VPM.add(Muro74);
		VPM.add(Muro75);
		VPM.add(Muro76);
		VPM.add(Muro77);
		VPM.add(Muro78);
		VPM.add(Muro79);
		VPM.add(Muro80);
		VPM.add(Muro81);
		VPM.add(Muro82);
		VPM.add(Muro83);
		VPM.add(Muro84);
		VPM.add(Muro85);
		VPM.add(Muro86);
		VPM.add(Muro87);
		VPM.add(Muro88);
		VPM.add(Muro89);
		VPM.add(Muro90);
		VPM.add(Muro91);
		VPM.add(Muro92);
		VPM.add(Muro93);
		VPM.add(Muro94);
		VPM.add(Muro95);
		VPM.add(Muro96);
		VPM.add(Muro97);
		VPM.add(Muro98);
		VPM.add(Muro99);
		VPM.add(Muro100);
		VPM.add(Muro101);
		VPM.add(Muro102);
		VPM.add(Muro103);
		VPM.add(Muro104);
		VPM.add(Muro105);
		VPM.add(Muro106);
		VPM.add(Muro107);
		VPM.add(Muro108);
		VPM.add(Muro109);
		VPM.add(Muro110);
		VPM.add(Muro111);
		VPM.add(Muro112);
		VPM.add(Muro113);
		VPM.add(Muro114);
		VPM.add(Muro115);
		VPM.add(Muro116);
		VPM.add(Muro117);
		VPM.add(Muro118);
		VPM.add(Muro119);
		VPM.add(Muro120);
		VPM.add(Muro121);
		VPM.add(Muro122);
		VPM.add(Muro123);
		VPM.add(Muro124);
		VPM.add(Muro125);
		VPM.add(Muro126);
		VPM.add(Muro127);
		VPM.add(Muro128);
		VPM.add(Muro129);
		VPM.add(Muro130);
		VPM.add(Muro131);
		VPM.add(Muro132);
		VPM.add(Muro133);
		VPM.add(Muro134);
		VPM.add(Muro135);
		VPM.add(Muro136);
		VPM.add(Muro137);
		VPM.add(Muro138);
		VPM.add(Muro139);
		VPM.add(Muro140);
		VPM.add(Muro141);
		VPM.add(Muro142);
		VPM.add(Muro143);
		VPM.add(Muro144);
		VPM.add(Muro145);
		VPM.add(Muro146);
		VPM.add(Muro147);
		VPM.add(Muro148);
		VPM.add(Muro149);
		VPM.add(Muro150);
		VPM.add(Muro151);
		VPM.add(Muro152);
		VPM.add(Muro153);
		VPM.add(Muro154);
		VPM.add(Muro155);
		VPM.add(Muro156);
		VPM.add(Muro157);
		VPM.add(Muro158);
		VPM.add(Muro159);
		VPM.add(Muro160);
		VPM.add(Muro161);
		VPM.add(Muro162);
		VPM.add(Muro163);
		VPM.add(Muro164);
		VPM.add(Muro165);
		VPM.add(Muro166);
		VPM.add(Muro167);
		VPM.add(Muro168);
		VPM.add(Muro169);
		VPM.add(Muro170);
		VPM.add(Muro171);
		VPM.add(Muro172);
		VPM.add(Muro173);
		VPM.add(Muro174);
		VPM.add(Muro175);
		VPM.add(Muro176);
		VPM.add(Muro177);
		VPM.add(Muro178);
		VPM.add(Muro179);
		VPM.add(Muro180);
		VPM.add(Muro181);
		VPM.add(Muro182);
		VPM.add(Muro183);
		VPM.add(Muro184);
		VPM.add(Muro185);
		VPM.add(Muro186);
		VPM.add(Muro187);
		VPM.add(Muro188);
		VPM.add(Muro189);
		VPM.add(Muro190);
		VPM.add(Muro191);
		VPM.add(Muro192);
		VPM.add(Muro193);
		VPM.add(Muro194);
		VPM.add(Muro195);
		VPM.add(Muro196);
		VPM.add(Muro197);
		VPM.add(Muro198);
		VPM.add(Muro199);
		VPM.add(Muro200);
		VPM.add(Muro201);
		VPM.add(Muro202);
		VPM.add(Muro203);
		VPM.add(Muro204);
		VPM.add(Muro205);
		VPM.add(Muro206);
		VPM.add(Muro207);
		VPM.add(Muro208);
		VPM.add(Muro209);
		VPM.add(Muro210);
		VPM.add(Muro211);
		VPM.add(Muro212);
		VPM.add(Muro213);
		VPM.add(Muro214);
		VPM.add(Muro215);
		VPM.add(Muro216);
		VPM.add(Muro217);
		VPM.add(Muro218);
		VPM.add(Muro219);
		VPM.add(Muro220);
		VPM.add(Muro221);
		VPM.add(Muro222);
		VPM.add(Muro223);
		VPM.add(Muro224);
		VPM.add(Muro225);
		VPM.add(Muro226);
		VPM.add(Muro227);
		VPM.add(Muro228);
		VPM.add(Muro229);
		VPM.add(Muro230);
		VPM.add(Muro231);
		VPM.add(Muro232);
		VPM.add(Muro233);
		VPM.add(Muro234);
			//Bolas
		VPM.add(Bola1);
		VPM.add(Bola2);
		VPM.add(Bola3);
		VPM.add(Bola4);
		VPM.add(Bola5);
		VPM.add(Bola6);
		VPM.add(Bola7);
		VPM.add(Bola8);
		VPM.add(Bola9);
		VPM.add(Bola10);
		VPM.add(Bola11);
		VPM.add(Bola12);
		VPM.add(Bola13);
		VPM.add(Bola14);
		VPM.add(Bola15);
		VPM.add(Bola16);
		VPM.add(Bola17);
		VPM.add(Bola18);
		VPM.add(Bola19);
		VPM.add(Bola20);
		VPM.add(Bola21);
		VPM.add(Bola22);
		VPM.add(Bola23);
		VPM.add(Bola24);
		VPM.add(Bola25);
		VPM.add(Bola26);
		VPM.add(Bola27);
		VPM.add(Bola28);
		
		objMostrados.add(Fr);
		objMostrados.add(Fa);
			//Muros
		objMostrados.add(M1);
		objMostrados.add(M2);
		objMostrados.add(M3);
		objMostrados.add(M4);
		objMostrados.add(M5);
		objMostrados.add(M6);
		objMostrados.add(M7);
		objMostrados.add(M8);
		objMostrados.add(M9);
		objMostrados.add(M10);
		objMostrados.add(M11);
		objMostrados.add(M12);
		objMostrados.add(M13);
		objMostrados.add(M14);
		objMostrados.add(M61);
		objMostrados.add(M15);
		objMostrados.add(M17);
		objMostrados.add(M18);
		objMostrados.add(M19);
		objMostrados.add(M20);
		objMostrados.add(M21);
		objMostrados.add(M22);
		objMostrados.add(M23);
		objMostrados.add(M24);
		objMostrados.add(M25);
		objMostrados.add(M26);
		objMostrados.add(M27);
		objMostrados.add(M28);
		objMostrados.add(M29);
		objMostrados.add(M30);
		objMostrados.add(M31);
		objMostrados.add(M32);
		objMostrados.add(M33);
		objMostrados.add(M34);
		objMostrados.add(M35);
		objMostrados.add(M36);
		objMostrados.add(M37);
		objMostrados.add(M38);
		objMostrados.add(M39);
		objMostrados.add(M40);
		objMostrados.add(M41);
		objMostrados.add(M42);
		objMostrados.add(M43);
		objMostrados.add(M44);
		objMostrados.add(M45);
		objMostrados.add(M46);
		objMostrados.add(M47);
		objMostrados.add(M48);
		objMostrados.add(M49);
		objMostrados.add(M50);
		objMostrados.add(M51);
		objMostrados.add(M52);
		objMostrados.add(M53);
		objMostrados.add(M54);
		objMostrados.add(M55);
		objMostrados.add(M56);
		objMostrados.add(M57);
		objMostrados.add(M58);
		objMostrados.add(M59);
		objMostrados.add(M60);
		objMostrados.add(M62);
		objMostrados.add(M63);
//		objMostrados.add(M64);
//		objMostrados.add(M65);
//		objMostrados.add(M66);
		objMostrados.add(M67);
		objMostrados.add(M68);
		objMostrados.add(M69);
		objMostrados.add(M70);
		objMostrados.add(M71);
		objMostrados.add(M72);
		objMostrados.add(M73);
		objMostrados.add(M74);
		objMostrados.add(M75);
		objMostrados.add(M76);
		objMostrados.add(M77);
		objMostrados.add(M78);
		objMostrados.add(M79);
		objMostrados.add(M80);
		objMostrados.add(M81);
		objMostrados.add(M82);
		objMostrados.add(M83);
		objMostrados.add(M84);
		objMostrados.add(M85);
		objMostrados.add(M86);
		objMostrados.add(M87);
		objMostrados.add(M88);
		objMostrados.add(M89);
		objMostrados.add(M90);
		objMostrados.add(M91);
		objMostrados.add(M92);
		objMostrados.add(M93);
		objMostrados.add(M94);
		objMostrados.add(M95);
		objMostrados.add(M96);
		objMostrados.add(M97);
		objMostrados.add(M98);
		objMostrados.add(M99);
		objMostrados.add(M100);
		objMostrados.add(M101);
		objMostrados.add(M102);
		objMostrados.add(M103);
		objMostrados.add(M104);
		objMostrados.add(M105);
		objMostrados.add(M106);
		objMostrados.add(M107);
		objMostrados.add(M108);
		objMostrados.add(M109);
		objMostrados.add(M110);
		objMostrados.add(M111);
		objMostrados.add(M112);
		objMostrados.add(M113);
		objMostrados.add(M114);
		objMostrados.add(M115);
		objMostrados.add(M116);
		objMostrados.add(M117);
		objMostrados.add(M118);
		objMostrados.add(M119);
		objMostrados.add(M120);
		objMostrados.add(M121);
		objMostrados.add(M122);
		objMostrados.add(M123);
		objMostrados.add(M124);
		objMostrados.add(M125);
		objMostrados.add(M126);
		objMostrados.add(M127);
		objMostrados.add(M128);
		objMostrados.add(M129);
		objMostrados.add(M130);
		objMostrados.add(M131);
		objMostrados.add(M132);
		objMostrados.add(M133);
		objMostrados.add(M134);
		objMostrados.add(M135);
		objMostrados.add(M136);
		objMostrados.add(M137);
		objMostrados.add(M138);
		objMostrados.add(M139);
		objMostrados.add(M140);
		objMostrados.add(M141);
		objMostrados.add(M142);
		objMostrados.add(M143);
		objMostrados.add(M144);
		objMostrados.add(M145);
		objMostrados.add(M146);
		objMostrados.add(M147);
		objMostrados.add(M148);
		objMostrados.add(M149);
		objMostrados.add(M150);
		objMostrados.add(M151);
		objMostrados.add(M152);
		objMostrados.add(M153);
		objMostrados.add(M154);
		objMostrados.add(M155);
		objMostrados.add(M156);
		objMostrados.add(M157);
		objMostrados.add(M158);
		objMostrados.add(M159);
		objMostrados.add(M160);
		objMostrados.add(M161);
		objMostrados.add(M162);
		objMostrados.add(M163);
		objMostrados.add(M164);
		objMostrados.add(M165);
		objMostrados.add(M166);
		objMostrados.add(M167);
		objMostrados.add(M168);
		objMostrados.add(M169);
		objMostrados.add(M170);
		objMostrados.add(M171);
		objMostrados.add(M172);
		objMostrados.add(M173);
		objMostrados.add(M174);
		objMostrados.add(M175);
		objMostrados.add(M176);
		objMostrados.add(M177);
		objMostrados.add(M178);
		objMostrados.add(M179);
		objMostrados.add(M180);
		objMostrados.add(M181);
		objMostrados.add(M182);
		objMostrados.add(M183);
		objMostrados.add(M184);
		objMostrados.add(M185);
		objMostrados.add(M186);
		objMostrados.add(M187);
		objMostrados.add(M188);
		objMostrados.add(M189);
		objMostrados.add(M190);
		objMostrados.add(M191);
		objMostrados.add(M192);
		objMostrados.add(M193);
		objMostrados.add(M194);
		objMostrados.add(M195);
		objMostrados.add(M196);
		objMostrados.add(M197);
		objMostrados.add(M198);
		objMostrados.add(M199);
		objMostrados.add(M200);
		objMostrados.add(M201);
		objMostrados.add(M202);
		objMostrados.add(M203);
		objMostrados.add(M204);
		objMostrados.add(M205);
		objMostrados.add(M206);
		objMostrados.add(M207);
		objMostrados.add(M208);
		objMostrados.add(M209);
		objMostrados.add(M210);
		objMostrados.add(M211);
		objMostrados.add(M212);
		objMostrados.add(M213);
		objMostrados.add(M214);
		objMostrados.add(M215);
		objMostrados.add(M216);
		objMostrados.add(M217);
		objMostrados.add(M218);
		objMostrados.add(M219);
		objMostrados.add(M220);
		objMostrados.add(M221);
		objMostrados.add(M222);
		objMostrados.add(M223);
		objMostrados.add(M224);
		objMostrados.add(M225);
		objMostrados.add(M226);
		objMostrados.add(M227);
		objMostrados.add(M228);
		objMostrados.add(M229);
		objMostrados.add(M230);
		objMostrados.add(M231);
		objMostrados.add(M232);
		objMostrados.add(M233);
		objMostrados.add(M234);
			//Bolas
		objMostrados.add(B1);
		objMostrados.add(B2);
		objMostrados.add(B3);
		objMostrados.add(B4);
		objMostrados.add(B5);
		objMostrados.add(B6);
		objMostrados.add(B7);
		objMostrados.add(B8);
		objMostrados.add(B9);
		objMostrados.add(B10);
		objMostrados.add(B11);
		objMostrados.add(B12);
		objMostrados.add(B13);
		objMostrados.add(B14);
		objMostrados.add(B15);
		objMostrados.add(B16);
		objMostrados.add(B17);
		objMostrados.add(B18);
		objMostrados.add(B19);
		objMostrados.add(B20);
		objMostrados.add(B21);
		objMostrados.add(B22);
		objMostrados.add(B23);
		objMostrados.add(B24);
		objMostrados.add(B25);
		objMostrados.add(B26);

//		Thread puntos = new Thread() {
//			public void run() {
//				while (Integer.parseInt(vidas.getText()) > 0) {
//				lock.lock();
//				try {
//					int x = listaComidos.size();
//					pts.setText(x * 100 + "");
//				}finally {
//					lock.unlock();
//				}
//			 }
//			}
//		};puntos.start();

		Thread movimiento = new Thread() {
			public void run() {
				while (Integer.parseInt(vidas.getText()) > 0) {
					comer(); 
					dibujar();
					mover(direccion, PM);
					comprobarSiguiente(direccion, PM);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}if(Integer.parseInt(vidas.getText()) == 0) {
					int pts = listaComidos.size() * 100 + cerezasComidas.size() * 350;
					VentanaScore VS = new VentanaScore(anchura, altura, "Pac-Man", pts);
					VS.setSize(anchura, altura);
					VS.setVisible(true);
					closeWindow(VPM);
				}
			}
		};movimiento.start();
			
		Thread movimientoF = new Thread() {
			public void run() {
				int x = 0;
				int numero;
				int numero2;
				int numero3;
				int numero4;
				while (Integer.parseInt(vidas.getText()) > 0) {
					if(x == 4) {
						numero = (int) (Math.random() * 4);
						direccionF1 = direccionesF.get(numero);
						numero2 = (int) (Math.random() * 4);
						direccionF2 = direccionesF.get(numero2);
						numero3 = (int) (Math.random() * 4);
						direccionF3 = direccionesF.get(numero3);
						numero4 = (int) (Math.random() * 4);
						direccionF4 = direccionesF.get(numero4);
						x = 0;
					}if(x < 4) {
					mover(direccionF1, Fa);		
					}x+=1;
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};movimientoF.start();

		VPM.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				// Tambien se puede hacer con e.getKeyCodeText(e.getKeyCode).equals(w, Arriba,
				// a, Izquierda, s, Abajo, d, derecha);
				if (e.getKeyCode() == 87 || e.getKeyCode() == 38) {
					direccion = "arriba";
					// System.out.println(direccion);

				}
				if (e.getKeyCode() == 65 || e.getKeyCode() == 37) {
					direccion = "izquierda";
					// System.out.println(direccion);

				}
				if (e.getKeyCode() == 68 || e.getKeyCode() == 39) {
					direccion = "derecha";
					// System.out.println(direccion);

				}
				if (e.getKeyCode() == 83 || e.getKeyCode() == 40) {
					direccion = "abajo";
					// System.out.println(direccion);

				}
			}
		});
	
	Thread cambiarF = new Thread() {
		int x = 0;
		boolean FAExiste;
		public void run() {
			while (Integer.parseInt(vidas.getText()) > 0) {
			if(x == 7) {
				for(PiezaoPersonaje objeto : objMostrados){
					if(objeto.getColor().contains("FA")) {
						Fantasma1.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaRojo.jpg")));
						Fantasma2.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaAmarillo.jpg")));
						if(objeto.getColor().equals("FA_1")) {
						objeto.setColor("Fr");
						}if(objeto.getColor().equals("FA_2")) {
						objeto.setColor("Fa");
						}
						FAExiste = false;
					}
					x = 0;
				}
			}if(x < 7){
				for(PiezaoPersonaje objeto : objMostrados){
					
					if(objeto.getColor().contains("FA")) {
						FAExiste = true;
					}
				}
				if(FAExiste){
					x+= 1;					
				}try {	
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}	
		}
		}
	};cambiarF.start();

	Thread apareceC = new Thread() {
		public void run() {
			int x = 0;
			Cereza.setVisible(false);
			while (Integer.parseInt(vidas.getText()) > 0) {
				if(x == 7 && !(Cereza.isVisible())) {
					Cereza.setVisible(true);
					Cereza.setBounds(C.getCoorX()*20, C.getCoorY()*20, 20, 20);
					x = 0;
				}if(x == 7 && Cereza.isVisible()) {
					x = 0;
				}if(x < 7) {
					x+= 1;
				}try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	};apareceC.run();
	}

	protected static void dibujar() {
		// TODO Auto-generated method stub
		PacMan.setBounds(PM.getCoorX()*20, PM.getCoorY()*20, 20, 20);
		Fantasma1.setBounds(Fr.getCoorX()*20, Fr.getCoorY()*20, 20, 20);
		Fantasma2.setBounds(Fa.getCoorX()*20, Fa.getCoorY()*20, 20, 20);
			//Muros
		Muro1.setBounds(M1.getCoorX()*20, M1.getCoorY()*20, 20, 20);
		Muro2.setBounds(M2.getCoorX()*20, M2.getCoorY()*20, 20, 20);
		Muro3.setBounds(M3.getCoorX()*20, M3.getCoorY()*20, 20, 20);
		Muro4.setBounds(M4.getCoorX()*20, M4.getCoorY()*20, 20, 20);
		Muro5.setBounds(M5.getCoorX()*20, M5.getCoorY()*20, 20, 20);
		Muro6.setBounds(M6.getCoorX()*20, M6.getCoorY()*20, 20, 20);
		Muro7.setBounds(M7.getCoorX()*20, M7.getCoorY()*20, 20, 20);
		Muro8.setBounds(M8.getCoorX()*20, M8.getCoorY()*20, 20, 20);
		Muro9.setBounds(M9.getCoorX()*20, M9.getCoorY()*20, 20, 20);
		Muro10.setBounds(M10.getCoorX()*20, M10.getCoorY()*20, 20, 20);
		Muro11.setBounds(M11.getCoorX()*20, M11.getCoorY()*20, 20, 20);
		Muro12.setBounds(M12.getCoorX()*20, M12.getCoorY()*20, 20, 20);
		Muro13.setBounds(M13.getCoorX()*20, M13.getCoorY()*20, 20, 20);
		Muro14.setBounds(M14.getCoorX()*20, M14.getCoorY()*20, 20, 20);
		Muro15.setBounds(M15.getCoorX()*20, M15.getCoorY()*20, 20, 20);
		Muro61.setBounds(M61.getCoorX()*20, M61.getCoorY()*20, 20, 20);
		Muro17.setBounds(M17.getCoorX()*20, M17.getCoorY()*20, 20, 20);
		Muro18.setBounds(M18.getCoorX()*20, M18.getCoorY()*20, 20, 20);
		Muro19.setBounds(M19.getCoorX()*20, M19.getCoorY()*20, 20, 20);
		Muro20.setBounds(M20.getCoorX()*20, M20.getCoorY()*20, 20, 20);
		Muro21.setBounds(M21.getCoorX()*20, M21.getCoorY()*20, 20, 20);
		Muro22.setBounds(M22.getCoorX()*20, M22.getCoorY()*20, 20, 20);
		Muro23.setBounds(M23.getCoorX()*20, M23.getCoorY()*20, 20, 20);
		Muro24.setBounds(M24.getCoorX()*20, M24.getCoorY()*20, 20, 20);
		Muro25.setBounds(M25.getCoorX()*20, M25.getCoorY()*20, 20, 20);
		Muro26.setBounds(M26.getCoorX()*20, M26.getCoorY()*20, 20, 20);
		Muro27.setBounds(M27.getCoorX()*20, M27.getCoorY()*20, 20, 20);
		Muro28.setBounds(M28.getCoorX()*20, M28.getCoorY()*20, 20, 20);
		Muro29.setBounds(M29.getCoorX()*20, M29.getCoorY()*20, 20, 20);
		Muro30.setBounds(M30.getCoorX()*20, M30.getCoorY()*20, 20, 20);
		Muro31.setBounds(M31.getCoorX()*20, M31.getCoorY()*20, 20, 20);
		Muro32.setBounds(M32.getCoorX()*20, M32.getCoorY()*20, 20, 20);
		Muro33.setBounds(M33.getCoorX()*20, M33.getCoorY()*20, 20, 20);
		Muro34.setBounds(M34.getCoorX()*20, M34.getCoorY()*20, 20, 20);
		Muro35.setBounds(M35.getCoorX()*20, M35.getCoorY()*20, 20, 20);
		Muro36.setBounds(M36.getCoorX()*20, M36.getCoorY()*20, 20, 20);
		Muro37.setBounds(M37.getCoorX()*20, M37.getCoorY()*20, 20, 20);
		Muro38.setBounds(M38.getCoorX()*20, M38.getCoorY()*20, 20, 20);
		Muro39.setBounds(M39.getCoorX()*20, M39.getCoorY()*20, 20, 20);
		Muro40.setBounds(M40.getCoorX()*20, M40.getCoorY()*20, 20, 20);
		Muro41.setBounds(M41.getCoorX()*20, M41.getCoorY()*20, 20, 20);
		Muro42.setBounds(M42.getCoorX()*20, M42.getCoorY()*20, 20, 20);
		Muro43.setBounds(M43.getCoorX()*20, M43.getCoorY()*20, 20, 20);
		Muro44.setBounds(M44.getCoorX()*20, M44.getCoorY()*20, 20, 20);
		Muro45.setBounds(M45.getCoorX()*20, M45.getCoorY()*20, 20, 20);
		Muro46.setBounds(M46.getCoorX()*20, M46.getCoorY()*20, 20, 20);
		Muro47.setBounds(M47.getCoorX()*20, M47.getCoorY()*20, 20, 20);
		Muro48.setBounds(M48.getCoorX()*20, M48.getCoorY()*20, 20, 20);
		Muro49.setBounds(M49.getCoorX()*20, M49.getCoorY()*20, 20, 20);
		Muro50.setBounds(M50.getCoorX()*20, M50.getCoorY()*20, 20, 20);
		Muro51.setBounds(M51.getCoorX()*20, M51.getCoorY()*20, 20, 20);
		Muro52.setBounds(M52.getCoorX()*20, M52.getCoorY()*20, 20, 20);
		Muro53.setBounds(M53.getCoorX()*20, M53.getCoorY()*20, 20, 20);
		Muro54.setBounds(M54.getCoorX()*20, M54.getCoorY()*20, 20, 20);
		Muro55.setBounds(M55.getCoorX()*20, M55.getCoorY()*20, 20, 20);
		Muro56.setBounds(M56.getCoorX()*20, M56.getCoorY()*20, 20, 20);
		Muro57.setBounds(M57.getCoorX()*20, M57.getCoorY()*20, 20, 20);
		Muro58.setBounds(M58.getCoorX()*20, M58.getCoorY()*20, 20, 20);
		Muro59.setBounds(M59.getCoorX()*20, M59.getCoorY()*20, 20, 20);
		Muro60.setBounds(M60.getCoorX()*20, M60.getCoorY()*20, 20, 20);
		Muro62.setBounds(M62.getCoorX()*20, M62.getCoorY()*20, 20, 20);
		Muro63.setBounds(M63.getCoorX()*20, M63.getCoorY()*20, 20, 20);
//		Muro64.setBounds(M64.getCoorX()*20, M64.getCoorY()*20, 20, 20);
//		Muro65.setBounds(M65.getCoorX()*20, M65.getCoorY()*20, 20, 20);
//		Muro66.setBounds(M66.getCoorX()*20, M66.getCoorY()*20, 20, 20);
		Muro67.setBounds(M67.getCoorX()*20, M67.getCoorY()*20, 20, 20);
		Muro68.setBounds(M68.getCoorX()*20, M68.getCoorY()*20, 20, 20);
		Muro69.setBounds(M69.getCoorX()*20, M69.getCoorY()*20, 20, 20);
		Muro70.setBounds(M70.getCoorX()*20, M70.getCoorY()*20, 20, 20);
		Muro71.setBounds(M71.getCoorX()*20, M71.getCoorY()*20, 20, 20);
		Muro72.setBounds(M72.getCoorX()*20, M72.getCoorY()*20, 20, 20);
		Muro73.setBounds(M73.getCoorX()*20, M73.getCoorY()*20, 20, 20);
		Muro74.setBounds(M74.getCoorX()*20, M74.getCoorY()*20, 20, 20);
		Muro75.setBounds(M75.getCoorX()*20, M75.getCoorY()*20, 20, 20);
		Muro76.setBounds(M76.getCoorX()*20, M76.getCoorY()*20, 20, 20);
		Muro77.setBounds(M77.getCoorX()*20, M77.getCoorY()*20, 20, 20);
		Muro78.setBounds(M78.getCoorX()*20, M78.getCoorY()*20, 20, 20);
		Muro79.setBounds(M79.getCoorX()*20, M79.getCoorY()*20, 20, 20);
		Muro80.setBounds(M80.getCoorX()*20, M80.getCoorY()*20, 20, 20);
		Muro81.setBounds(M81.getCoorX()*20, M81.getCoorY()*20, 20, 20);
		Muro82.setBounds(M82.getCoorX()*20, M82.getCoorY()*20, 20, 20);
		Muro83.setBounds(M83.getCoorX()*20, M83.getCoorY()*20, 20, 20);
		Muro84.setBounds(M84.getCoorX()*20, M84.getCoorY()*20, 20, 20);
		Muro85.setBounds(M85.getCoorX()*20, M85.getCoorY()*20, 20, 20);
		Muro86.setBounds(M86.getCoorX()*20, M86.getCoorY()*20, 20, 20);
		Muro87.setBounds(M87.getCoorX()*20, M87.getCoorY()*20, 20, 20);
		Muro88.setBounds(M88.getCoorX()*20, M88.getCoorY()*20, 20, 20);
		Muro89.setBounds(M89.getCoorX()*20, M89.getCoorY()*20, 20, 20);
		Muro90.setBounds(M90.getCoorX()*20, M80.getCoorY()*20, 20, 20);
		Muro91.setBounds(M91.getCoorX()*20, M91.getCoorY()*20, 20, 20);
		Muro92.setBounds(M92.getCoorX()*20, M92.getCoorY()*20, 20, 20);
		Muro93.setBounds(M93.getCoorX()*20, M93.getCoorY()*20, 20, 20);
		Muro94.setBounds(M94.getCoorX()*20, M94.getCoorY()*20, 20, 20);
		Muro95.setBounds(M95.getCoorX()*20, M95.getCoorY()*20, 20, 20);
		Muro96.setBounds(M96.getCoorX()*20, M96.getCoorY()*20, 20, 20);
		Muro97.setBounds(M97.getCoorX()*20, M97.getCoorY()*20, 20, 20);
		Muro98.setBounds(M98.getCoorX()*20, M98.getCoorY()*20, 20, 20);
		Muro99.setBounds(M99.getCoorX()*20, M99.getCoorY()*20, 20, 20);
		Muro100.setBounds(M100.getCoorX()*20, M100.getCoorY()*20, 20, 20);
		Muro101.setBounds(M101.getCoorX()*20, M101.getCoorY()*20, 20, 20);
		Muro102.setBounds(M102.getCoorX()*20, M102.getCoorY()*20, 20, 20);
		Muro103.setBounds(M103.getCoorX()*20, M103.getCoorY()*20, 20, 20);
		Muro104.setBounds(M104.getCoorX()*20, M104.getCoorY()*20, 20, 20);
		Muro105.setBounds(M105.getCoorX()*20, M105.getCoorY()*20, 20, 20);
		Muro106.setBounds(M106.getCoorX()*20, M106.getCoorY()*20, 20, 20);
		Muro107.setBounds(M107.getCoorX()*20, M107.getCoorY()*20, 20, 20);
		Muro108.setBounds(M108.getCoorX()*20, M108.getCoorY()*20, 20, 20);
		Muro109.setBounds(M109.getCoorX()*20, M109.getCoorY()*20, 20, 20);
		Muro110.setBounds(M110.getCoorX()*20, M110.getCoorY()*20, 20, 20);
		Muro111.setBounds(M111.getCoorX()*20, M111.getCoorY()*20, 20, 20);
		Muro112.setBounds(M112.getCoorX()*20, M112.getCoorY()*20, 20, 20);
		Muro113.setBounds(M113.getCoorX()*20, M113.getCoorY()*20, 20, 20);
		Muro114.setBounds(M114.getCoorX()*20, M114.getCoorY()*20, 20, 20);
		Muro115.setBounds(M115.getCoorX()*20, M115.getCoorY()*20, 20, 20);
		Muro116.setBounds(M116.getCoorX()*20, M116.getCoorY()*20, 20, 20);
		Muro117.setBounds(M117.getCoorX()*20, M117.getCoorY()*20, 20, 20);
		Muro118.setBounds(M118.getCoorX()*20, M118.getCoorY()*20, 20, 20);
		Muro119.setBounds(M119.getCoorX()*20, M119.getCoorY()*20, 20, 20);
		Muro120.setBounds(M120.getCoorX()*20, M120.getCoorY()*20, 20, 20);
		Muro121.setBounds(M121.getCoorX()*20, M121.getCoorY()*20, 20, 20);
		Muro122.setBounds(M122.getCoorX()*20, M122.getCoorY()*20, 20, 20);
		Muro123.setBounds(M123.getCoorX()*20, M123.getCoorY()*20, 20, 20);
		Muro124.setBounds(M124.getCoorX()*20, M124.getCoorY()*20, 20, 20);
		Muro125.setBounds(M125.getCoorX()*20, M125.getCoorY()*20, 20, 20);
		Muro126.setBounds(M126.getCoorX()*20, M126.getCoorY()*20, 20, 20);
		Muro127.setBounds(M127.getCoorX()*20, M127.getCoorY()*20, 20, 20);
		Muro128.setBounds(M128.getCoorX()*20, M128.getCoorY()*20, 20, 20);
		Muro129.setBounds(M129.getCoorX()*20, M129.getCoorY()*20, 20, 20);
		Muro130.setBounds(M130.getCoorX()*20, M130.getCoorY()*20, 20, 20);
		Muro131.setBounds(M131.getCoorX()*20, M131.getCoorY()*20, 20, 20);
		Muro132.setBounds(M132.getCoorX()*20, M132.getCoorY()*20, 20, 20);
		Muro133.setBounds(M133.getCoorX()*20, M133.getCoorY()*20, 20, 20);
		Muro134.setBounds(M134.getCoorX()*20, M134.getCoorY()*20, 20, 20);
		Muro135.setBounds(M135.getCoorX()*20, M135.getCoorY()*20, 20, 20);
		Muro136.setBounds(M136.getCoorX()*20, M136.getCoorY()*20, 20, 20);
		Muro137.setBounds(M137.getCoorX()*20, M137.getCoorY()*20, 20, 20);
		Muro138.setBounds(M138.getCoorX()*20, M138.getCoorY()*20, 20, 20);
		Muro139.setBounds(M139.getCoorX()*20, M139.getCoorY()*20, 20, 20);
		Muro140.setBounds(M140.getCoorX()*20, M140.getCoorY()*20, 20, 20);
		Muro141.setBounds(M141.getCoorX()*20, M141.getCoorY()*20, 20, 20);
		Muro142.setBounds(M142.getCoorX()*20, M142.getCoorY()*20, 20, 20);
		Muro143.setBounds(M143.getCoorX()*20, M143.getCoorY()*20, 20, 20);
		Muro144.setBounds(M144.getCoorX()*20, M144.getCoorY()*20, 20, 20);
		Muro145.setBounds(M145.getCoorX()*20, M145.getCoorY()*20, 20, 20);
		Muro146.setBounds(M146.getCoorX()*20, M146.getCoorY()*20, 20, 20);
		Muro147.setBounds(M147.getCoorX()*20, M147.getCoorY()*20, 20, 20);
		Muro148.setBounds(M148.getCoorX()*20, M148.getCoorY()*20, 20, 20);
		Muro149.setBounds(M149.getCoorX()*20, M149.getCoorY()*20, 20, 20);
		Muro150.setBounds(M150.getCoorX()*20, M150.getCoorY()*20, 20, 20);
		Muro151.setBounds(M151.getCoorX()*20, M151.getCoorY()*20, 20, 20);
		Muro152.setBounds(M152.getCoorX()*20, M152.getCoorY()*20, 20, 20);
		Muro153.setBounds(M153.getCoorX()*20, M153.getCoorY()*20, 20, 20);
		Muro154.setBounds(M154.getCoorX()*20, M154.getCoorY()*20, 20, 20);
		Muro155.setBounds(M155.getCoorX()*20, M155.getCoorY()*20, 20, 20);
		Muro156.setBounds(M156.getCoorX()*20, M156.getCoorY()*20, 20, 20);
		Muro157.setBounds(M157.getCoorX()*20, M157.getCoorY()*20, 20, 20);
		Muro158.setBounds(M158.getCoorX()*20, M158.getCoorY()*20, 20, 20);
		Muro159.setBounds(M159.getCoorX()*20, M159.getCoorY()*20, 20, 20);
		Muro160.setBounds(M160.getCoorX()*20, M160.getCoorY()*20, 20, 20);
		Muro161.setBounds(M161.getCoorX()*20, M161.getCoorY()*20, 20, 20);
		Muro162.setBounds(M162.getCoorX()*20, M162.getCoorY()*20, 20, 20);
		Muro163.setBounds(M163.getCoorX()*20, M163.getCoorY()*20, 20, 20);
		Muro164.setBounds(M164.getCoorX()*20, M164.getCoorY()*20, 20, 20);
		Muro165.setBounds(M165.getCoorX()*20, M165.getCoorY()*20, 20, 20);
		Muro166.setBounds(M166.getCoorX()*20, M166.getCoorY()*20, 20, 20);
		Muro167.setBounds(M167.getCoorX()*20, M167.getCoorY()*20, 20, 20);
		Muro168.setBounds(M168.getCoorX()*20, M168.getCoorY()*20, 20, 20);
		Muro169.setBounds(M169.getCoorX()*20, M169.getCoorY()*20, 20, 20);
		Muro170.setBounds(M170.getCoorX()*20, M170.getCoorY()*20, 20, 20);
		Muro171.setBounds(M171.getCoorX()*20, M171.getCoorY()*20, 20, 20);
		Muro172.setBounds(M172.getCoorX()*20, M172.getCoorY()*20, 20, 20);
		Muro173.setBounds(M173.getCoorX()*20, M173.getCoorY()*20, 20, 20);
		Muro174.setBounds(M174.getCoorX()*20, M174.getCoorY()*20, 20, 20);
		Muro175.setBounds(M175.getCoorX()*20, M175.getCoorY()*20, 20, 20);
		Muro176.setBounds(M176.getCoorX()*20, M176.getCoorY()*20, 20, 20);
		Muro177.setBounds(M177.getCoorX()*20, M177.getCoorY()*20, 20, 20);
		Muro178.setBounds(M178.getCoorX()*20, M178.getCoorY()*20, 20, 20);
		Muro179.setBounds(M179.getCoorX()*20, M179.getCoorY()*20, 20, 20);
		Muro180.setBounds(M180.getCoorX()*20, M180.getCoorY()*20, 20, 20);
		Muro181.setBounds(M181.getCoorX()*20, M181.getCoorY()*20, 20, 20);
		Muro182.setBounds(M182.getCoorX()*20, M182.getCoorY()*20, 20, 20);
		Muro183.setBounds(M183.getCoorX()*20, M183.getCoorY()*20, 20, 20);
		Muro184.setBounds(M184.getCoorX()*20, M184.getCoorY()*20, 20, 20);
		Muro185.setBounds(M185.getCoorX()*20, M185.getCoorY()*20, 20, 20);
		Muro186.setBounds(M186.getCoorX()*20, M186.getCoorY()*20, 20, 20);
		Muro187.setBounds(M187.getCoorX()*20, M187.getCoorY()*20, 20, 20);
		Muro188.setBounds(M188.getCoorX()*20, M188.getCoorY()*20, 20, 20);
		Muro189.setBounds(M189.getCoorX()*20, M189.getCoorY()*20, 20, 20);
		Muro190.setBounds(M190.getCoorX()*20, M190.getCoorY()*20, 20, 20);
		Muro191.setBounds(M191.getCoorX()*20, M191.getCoorY()*20, 20, 20);
		Muro192.setBounds(M192.getCoorX()*20, M192.getCoorY()*20, 20, 20);
		Muro193.setBounds(M193.getCoorX()*20, M193.getCoorY()*20, 20, 20);
		Muro194.setBounds(M194.getCoorX()*20, M194.getCoorY()*20, 20, 20);
		Muro195.setBounds(M195.getCoorX()*20, M195.getCoorY()*20, 20, 20);
		Muro196.setBounds(M196.getCoorX()*20, M196.getCoorY()*20, 20, 20);
		Muro197.setBounds(M197.getCoorX()*20, M197.getCoorY()*20, 20, 20);
		Muro198.setBounds(M198.getCoorX()*20, M198.getCoorY()*20, 20, 20);
		Muro199.setBounds(M199.getCoorX()*20, M199.getCoorY()*20, 20, 20);
		Muro200.setBounds(M200.getCoorX()*20, M200.getCoorY()*20, 20, 20);
		Muro201.setBounds(M201.getCoorX()*20, M201.getCoorY()*20, 20, 20);
		Muro202.setBounds(M202.getCoorX()*20, M202.getCoorY()*20, 20, 20);
		Muro203.setBounds(M203.getCoorX()*20, M203.getCoorY()*20, 20, 20);
		Muro204.setBounds(M204.getCoorX()*20, M204.getCoorY()*20, 20, 20);
		Muro205.setBounds(M205.getCoorX()*20, M205.getCoorY()*20, 20, 20);
		Muro206.setBounds(M206.getCoorX()*20, M206.getCoorY()*20, 20, 20);
		Muro207.setBounds(M207.getCoorX()*20, M207.getCoorY()*20, 20, 20);
		Muro208.setBounds(M208.getCoorX()*20, M208.getCoorY()*20, 20, 20);
		Muro209.setBounds(M209.getCoorX()*20, M209.getCoorY()*20, 20, 20);
		Muro210.setBounds(M210.getCoorX()*20, M210.getCoorY()*20, 20, 20);
		Muro211.setBounds(M211.getCoorX()*20, M211.getCoorY()*20, 20, 20);
		Muro212.setBounds(M212.getCoorX()*20, M212.getCoorY()*20, 20, 20);
		Muro213.setBounds(M213.getCoorX()*20, M213.getCoorY()*20, 20, 20);
		Muro214.setBounds(M214.getCoorX()*20, M214.getCoorY()*20, 20, 20);
		Muro215.setBounds(M215.getCoorX()*20, M215.getCoorY()*20, 20, 20);
		Muro216.setBounds(M216.getCoorX()*20, M216.getCoorY()*20, 20, 20);
		Muro217.setBounds(M217.getCoorX()*20, M217.getCoorY()*20, 20, 20);
		Muro218.setBounds(M218.getCoorX()*20, M218.getCoorY()*20, 20, 20);
		Muro219.setBounds(M219.getCoorX()*20, M219.getCoorY()*20, 20, 20);
		Muro220.setBounds(M220.getCoorX()*20, M220.getCoorY()*20, 20, 20);
		Muro221.setBounds(M221.getCoorX()*20, M221.getCoorY()*20, 20, 20);
		Muro222.setBounds(M222.getCoorX()*20, M222.getCoorY()*20, 20, 20);
		Muro223.setBounds(M223.getCoorX()*20, M223.getCoorY()*20, 20, 20);
		Muro224.setBounds(M224.getCoorX()*20, M224.getCoorY()*20, 20, 20);
		Muro225.setBounds(M225.getCoorX()*20, M225.getCoorY()*20, 20, 20);
		Muro226.setBounds(M226.getCoorX()*20, M226.getCoorY()*20, 20, 20);
		Muro227.setBounds(M227.getCoorX()*20, M227.getCoorY()*20, 20, 20);
		Muro228.setBounds(M228.getCoorX()*20, M228.getCoorY()*20, 20, 20);
		Muro229.setBounds(M229.getCoorX()*20, M229.getCoorY()*20, 20, 20);
		Muro230.setBounds(M230.getCoorX()*20, M230.getCoorY()*20, 20, 20);
		Muro231.setBounds(M231.getCoorX()*20, M231.getCoorY()*20, 20, 20);
		Muro232.setBounds(M232.getCoorX()*20, M232.getCoorY()*20, 20, 20);
		Muro233.setBounds(M233.getCoorX()*20, M233.getCoorY()*20, 20, 20);
		Muro234.setBounds(M234.getCoorX()*20, M234.getCoorY()*20, 20, 20);
			//Bolas
		Bola1.setBounds(B1.getCoorX()*20, B1.getCoorY()*20, 20, 20);
		Bola2.setBounds(B2.getCoorX()*20, B2.getCoorY()*20, 20, 20);
		Bola3.setBounds(B3.getCoorX()*20, B3.getCoorY()*20, 20, 20);
		Bola4.setBounds(B4.getCoorX()*20, B4.getCoorY()*20, 20, 20);
		Bola5.setBounds(B5.getCoorX()*20, B5.getCoorY()*20, 20, 20);
		Bola6.setBounds(B6.getCoorX()*20, B6.getCoorY()*20, 20, 20);
		Bola7.setBounds(B7.getCoorX()*20, B7.getCoorY()*20, 20, 20);
		Bola8.setBounds(B8.getCoorX()*20, B8.getCoorY()*20, 20, 20);
		Bola9.setBounds(B9.getCoorX()*20, B9.getCoorY()*20, 20, 20);
		Bola10.setBounds(B10.getCoorX()*20, B10.getCoorY()*20, 20, 20);
		Bola11.setBounds(B11.getCoorX()*20, B11.getCoorY()*20, 20, 20);
		Bola12.setBounds(B12.getCoorX()*20, B12.getCoorY()*20, 20, 20);
		Bola13.setBounds(B13.getCoorX()*20, B13.getCoorY()*20, 20, 20);
		Bola14.setBounds(B14.getCoorX()*20, B14.getCoorY()*20, 20, 20);
		Bola15.setBounds(B15.getCoorX()*20, B15.getCoorY()*20, 20, 20);
		Bola16.setBounds(B16.getCoorX()*20, B16.getCoorY()*20, 20, 20);
		Bola17.setBounds(B17.getCoorX()*20, B17.getCoorY()*20, 20, 20);
		Bola18.setBounds(B18.getCoorX()*20, B18.getCoorY()*20, 20, 20);
		Bola19.setBounds(B19.getCoorX()*20, B19.getCoorY()*20, 20, 20);
		Bola20.setBounds(B20.getCoorX()*20, B20.getCoorY()*20, 20, 20);
		Bola21.setBounds(B21.getCoorX()*20, B21.getCoorY()*20, 20, 20);
		Bola22.setBounds(B22.getCoorX()*20, B22.getCoorY()*20, 20, 20);
		Bola23.setBounds(B23.getCoorX()*20, B23.getCoorY()*20, 20, 20);
		Bola24.setBounds(B24.getCoorX()*20, B24.getCoorY()*20, 20, 20);
		Bola25.setBounds(B25.getCoorX()*20, B25.getCoorY()*20, 20, 20);
		Bola26.setBounds(B26.getCoorX()*20, B26.getCoorY()*20, 20, 20);
	}

	public static void comer() {
		int x = PM.getCoorX();
		int y = PM.getCoorY();
		for (int objeto = 0; objeto < objMostrados.size(); objeto ++) {
			if (x == objMostrados.get(objeto).getCoorX() && y == objMostrados.get(objeto).getCoorY()) {
				if (objMostrados.get(objeto).getColor().contains("F") && !(objMostrados.get(objeto).getColor().contains("FA")) && !(objMostrados.get(objeto).getColor().equals("BF"))) {
					vidas.setText(Integer.parseInt(vidas.getText()) - 1 + "");
					//Coordenada X		Coordenada Y
					//en la que se		en la que se
					//reinicia			reinicia
					PM.setCoorX(14);	PM.setCoorY(14);
					Fr.setCoorX(1);		Fr.setCoorY(1);
					Fa.setCoorX(1);		Fa.setCoorY(28);
				}
				if (objMostrados.get(objeto).getColor().equals("B1")) {
					listaComidos.add(new PiezaoPersonaje(objMostrados.get(objeto).getCoorX(), objMostrados.get(objeto).getCoorY(), objMostrados.get(objeto).getColor()));
					objMostrados.remove(objeto);
					Bola1.setVisible(false);
					objeto = 0;
					break;
				}if (objMostrados.get(objeto).getColor().equals("B2")) {
					listaComidos.add(new PiezaoPersonaje(objMostrados.get(objeto).getCoorX(), objMostrados.get(objeto).getCoorY(), objMostrados.get(objeto).getColor()));
					objMostrados.remove(objeto);
					Bola2.setVisible(false);
					objeto = 0;
					break;
				}
				if (objMostrados.get(objeto).getColor().contains("BF")) {
					if(objMostrados.get(objeto).getColor().equals("BF")) {
//						imagen3.setVisible(false);
					}
					objMostrados.remove(objeto);
					Fantasma1.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaAzul.jpg")));
					Fantasma2.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaAzul.jpg")));
					Fr.setColor("FA_1");
					Fa.setColor("FA_2");
					break;
				}
				if (objMostrados.get(objeto).getColor().equals("FA_1")) {
					objMostrados.get(objeto).setColor("Fr");
					Fantasma1.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaRojo.jpg")));
					objMostrados.get(objeto).setCoorX(1);
					objMostrados.get(objeto).setCoorY(14);
					listaComidos.add(new PiezaoPersonaje(objMostrados.get(objeto).getCoorX(), objMostrados.get(objeto).getCoorY(), objMostrados.get(objeto).getColor()));
				}
				if (objMostrados.get(objeto).getColor().equals("FA_2")) {
					objMostrados.get(objeto).setColor("Fa");
					Fantasma2.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaAmarillo.jpg")));
					objMostrados.get(objeto).setCoorX(1);
					objMostrados.get(objeto).setCoorY(28);
					listaComidos.add(new PiezaoPersonaje(objMostrados.get(objeto).getCoorX(), objMostrados.get(objeto).getCoorY(), objMostrados.get(objeto).getColor()));
				}
				if (objMostrados.get(objeto).getColor().equals("FA_3")) {
					
				}
				if (objMostrados.get(objeto).getColor().equals("FA_4")) {
	
				}
				if (objMostrados.get(objeto).getColor().equals("C")) {
					cerezasComidas.add(new PiezaoPersonaje(objMostrados.get(objeto).getCoorX(), objMostrados.get(objeto).getCoorY(), objMostrados.get(objeto).getColor()));
					cerezasVida.add(new PiezaoPersonaje(objMostrados.get(objeto).getCoorX(), objMostrados.get(objeto).getCoorY(), objMostrados.get(objeto).getColor()));
					Cereza.setVisible(false);
					aumentarVida();
					objeto = 0;
					break;
				}
			}
		}
	}

	// En caso de añadir las cerezas
	public static void aumentarVida() {
		if (cerezasVida.size() == 1) {
			vidas.setText(Integer.parseInt(vidas.getText()) + 1 + "");
			for (int cereza = 0; cereza < cerezasVida.size(); cereza ++) {
				cerezasVida.remove(cereza);
			}
		}
	}
	//Metodo mover
	public static void mover(String direccion, PiezaoPersonaje F) {	
		if(F.getColor().equals("PM")) {
			if (direccion.equals("derecha")) {
				PacMan.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/2000px-Pacman.svg.png")));
				//llamada a un hilo que sera la animacion de moverse
				F.setCoorX(F.getCoorX() + 1);
				
			}if (direccion.equals("abajo")) {
				PacMan.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/2000px-Pacman.svg.png")));
				F.setCoorY(F.getCoorY() + 1);
				
			}if (direccion.equals("izquierda")) {
				PacMan.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/2000px-Pacman.svg.png")));
				F.setCoorX(F.getCoorX() - 1);
				
			}if (direccion.equals("arriba")) {
				PacMan.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/2000px-Pacman.svg.png")));
				F.setCoorY(F.getCoorY() - 1);
				
			}if(direccion.equals("nada")) {
				PacMan.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/PM_C_M.png")));
				F.setCoorX(F.getCoorX());		F.setCoorY(F.getCoorY());
			}
		}else {
			if (direccion.equals("derecha")) {
				F.setCoorX(F.getCoorX() + 1);
				
			}if (direccion.equals("abajo")) {
				F.setCoorY(F.getCoorY() + 1);
				
			}if (direccion.equals("izquierda")) {
				F.setCoorX(F.getCoorX() - 1);
				
			}if (direccion.equals("arriba")) {
				F.setCoorY(F.getCoorY() - 1);
			}
		}
	}
	//Metodo comprobar si la siguiente casilla va ha ser un muro o un fantasma, si muro PM se para en la casilla que
	//esta, si fantasa se le quita una vida a PM y se vuelve alinicio cadapersonaje
	public static void comprobarSiguiente(String direccion, PiezaoPersonaje F) {
		int x = F.getCoorX();
		int y = F.getCoorY();
		if(direccion.equals("derecha")) {
			for(int objeto = 0; objeto < objMostrados.size(); objeto ++){
				if(objMostrados.get(objeto).getColor().contains("F")) {
					if(x == objMostrados.get(objeto).getCoorX() + 1 && y == objMostrados.get(objeto).getCoorY()) {
						vidas.setText(Integer.parseInt(vidas.getText()) -1 + "");
					}
				}if(objMostrados.get(objeto).getColor().contains("M")) {
					if(x == objMostrados.get(objeto).getCoorX() + 1 && y == objMostrados.get(objeto).getCoorY()) {
						setDireccion("nada");
						PM.setCoorX(PM.getCoorX() - 2);
					}
				}
			}
		}if(direccion.equals("izquierda")) {
			for(int objeto = 0; objeto < objMostrados.size(); objeto ++){
				if(objMostrados.get(objeto).getColor().contains("F")) {
					if(x == objMostrados.get(objeto).getCoorX() - 1 && y == objMostrados.get(objeto).getCoorY()) {
						vidas.setText(Integer.parseInt(vidas.getText()) -1 + "");
					}
				}if(objMostrados.get(objeto).getColor().contains("M")) {
					if(x == objMostrados.get(objeto).getCoorX() - 1 && y == objMostrados.get(objeto).getCoorY()) {
						setDireccion("nada");
						PM.setCoorX(PM.getCoorX() + 2);
					}
				}
			}
		}if(direccion.equals("arriba")) {
			for(int objeto = 0; objeto < objMostrados.size(); objeto ++){
				if(objMostrados.get(objeto).getColor().contains("F")) {
					if(y == objMostrados.get(objeto).getCoorY() - 1 && x == objMostrados.get(objeto).getCoorX()) {
						vidas.setText(Integer.parseInt(vidas.getText()) -1 + "");
					}
				}if(objMostrados.get(objeto).getColor().contains("M")) {
					if(y == objMostrados.get(objeto).getCoorY() - 1 && x == objMostrados.get(objeto).getCoorX()) {
						setDireccion("nada");
						PM.setCoorY(PM.getCoorY() + 2);
					}
				}
			}
		}if(direccion.equals("abajo")) {
			for(int objeto = 0; objeto < objMostrados.size(); objeto ++){
				if(objMostrados.get(objeto).getColor().contains("F")) {
					if(y == objMostrados.get(objeto).getCoorY() + 1 && x == objMostrados.get(objeto).getCoorX()) {
						vidas.setText(Integer.parseInt(vidas.getText()) -1 + "");
					}
				}if(objMostrados.get(objeto).getColor().contains("M")) {
					if(y == objMostrados.get(objeto).getCoorY() + 1 && x == objMostrados.get(objeto).getCoorX()) {
						setDireccion("nada");
						PM.setCoorY(PM.getCoorY() - 2);
					}
				}
			}
		}
	}
	
	private static void closeWindow(VentanaPM VPM) {
		VPM.dispose(); // eliminar el hilo
	}
}