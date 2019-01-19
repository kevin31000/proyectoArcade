//Buscar con ctrl+F "Empieza aqui" o linea: 
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
	static PiezaoPersonaje M223 = new PiezaoPersonaje(9, 2, "M223");
	static PiezaoPersonaje M224 = new PiezaoPersonaje(9, 3, "M224");
	static PiezaoPersonaje M225 = new PiezaoPersonaje(9, 4, "M225");
	static PiezaoPersonaje M226 = new PiezaoPersonaje(9, 6, "M226");
	static PiezaoPersonaje M227 = new PiezaoPersonaje(9, 8, "M227");
	static PiezaoPersonaje M228 = new PiezaoPersonaje(9, 12, "M228");
	static PiezaoPersonaje M229 = new PiezaoPersonaje(9, 13, "M229");
	static PiezaoPersonaje M230 = new PiezaoPersonaje(9, 14, "M230");
	static PiezaoPersonaje M231 = new PiezaoPersonaje(9, 15, "M231");
	static PiezaoPersonaje M232 = new PiezaoPersonaje(9, 16, "M232");
	static PiezaoPersonaje M233 = new PiezaoPersonaje(9, 17, "M233");
	static PiezaoPersonaje M234 = new PiezaoPersonaje(9, 21, "M234");
	static PiezaoPersonaje M247 = new PiezaoPersonaje(9, 23, "M247");
		//Muros 11va columna
	static PiezaoPersonaje M235 = new PiezaoPersonaje(10, 2, "M235");
	static PiezaoPersonaje M236 = new PiezaoPersonaje(10, 3, "M236");
	static PiezaoPersonaje M237 = new PiezaoPersonaje(10, 4, "M237");
	static PiezaoPersonaje M238 = new PiezaoPersonaje(10, 6, "M238");
	static PiezaoPersonaje M239 = new PiezaoPersonaje(10, 8, "M239");
	static PiezaoPersonaje M240 = new PiezaoPersonaje(10, 10, "M240");
	static PiezaoPersonaje M241 = new PiezaoPersonaje(10, 19, "M241");
	static PiezaoPersonaje M242 = new PiezaoPersonaje(10, 21, "M242");
	static PiezaoPersonaje M243 = new PiezaoPersonaje(10, 23, "M243");
	static PiezaoPersonaje M244 = new PiezaoPersonaje(10, 25, "M244");
	static PiezaoPersonaje M245 = new PiezaoPersonaje(10, 26, "M245");
	static PiezaoPersonaje M246 = new PiezaoPersonaje(10, 27, "M246");
		//Muros 12va columna
	static PiezaoPersonaje M248 = new PiezaoPersonaje(11, 2, "M248");
	static PiezaoPersonaje M249 = new PiezaoPersonaje(11, 3, "M249");
	static PiezaoPersonaje M250 = new PiezaoPersonaje(11, 4, "M250");
	static PiezaoPersonaje M251 = new PiezaoPersonaje(11, 6, "M251");
	static PiezaoPersonaje M252 = new PiezaoPersonaje(11, 12, "M252");
	static PiezaoPersonaje M253 = new PiezaoPersonaje(11, 13, "M253");
	static PiezaoPersonaje M254 = new PiezaoPersonaje(11, 14, "M254");
	static PiezaoPersonaje M255 = new PiezaoPersonaje(11, 15, "M255");
	static PiezaoPersonaje M256 = new PiezaoPersonaje(11, 16, "M256");
	static PiezaoPersonaje M257 = new PiezaoPersonaje(11, 17, "M257");
	static PiezaoPersonaje M258 = new PiezaoPersonaje(11, 23, "M258");
	static PiezaoPersonaje M259 = new PiezaoPersonaje(11, 25, "M259");
	static PiezaoPersonaje M260 = new PiezaoPersonaje(11, 26, "M260");
	static PiezaoPersonaje M261 = new PiezaoPersonaje(11, 27, "M261");
		//Muros 13va columna
	static PiezaoPersonaje M262 = new PiezaoPersonaje(12, 8, "M262");
	static PiezaoPersonaje M263 = new PiezaoPersonaje(12, 9, "M263");
	static PiezaoPersonaje M264 = new PiezaoPersonaje(12, 10, "M264");
	static PiezaoPersonaje M265 = new PiezaoPersonaje(12, 17, "M265");
	static PiezaoPersonaje M266 = new PiezaoPersonaje(12, 19, "M266");
	static PiezaoPersonaje M267 = new PiezaoPersonaje(12, 20, "M267");
	static PiezaoPersonaje M268 = new PiezaoPersonaje(12, 21, "M268");
	static PiezaoPersonaje M269 = new PiezaoPersonaje(12, 23, "M269");
	static PiezaoPersonaje M270 = new PiezaoPersonaje(12, 25, "M270");
	static PiezaoPersonaje M271 = new PiezaoPersonaje(12, 26, "M271");
	static PiezaoPersonaje M272 = new PiezaoPersonaje(12, 27, "M272");
	static PiezaoPersonaje M273 = new PiezaoPersonaje(12, 6, "M273");
		//Muros 14va columna
	static PiezaoPersonaje M274 = new PiezaoPersonaje(13, 2, "M274");
	static PiezaoPersonaje M275 = new PiezaoPersonaje(13, 3, "M275");
	static PiezaoPersonaje M276 = new PiezaoPersonaje(13, 4, "M276");
	static PiezaoPersonaje M277 = new PiezaoPersonaje(13, 6, "M277");
	static PiezaoPersonaje M278 = new PiezaoPersonaje(13, 12, "M278");
	static PiezaoPersonaje M279 = new PiezaoPersonaje(13, 17, "M279");
	static PiezaoPersonaje M280 = new PiezaoPersonaje(13, 19, "M280");
	static PiezaoPersonaje M281 = new PiezaoPersonaje(13, 20, "M281");
	static PiezaoPersonaje M282 = new PiezaoPersonaje(13, 21, "M282");
	static PiezaoPersonaje M283 = new PiezaoPersonaje(13, 23, "M283");
	static PiezaoPersonaje M284 = new PiezaoPersonaje(13, 25, "M284");
	static PiezaoPersonaje M285 = new PiezaoPersonaje(13, 26, "M285");
	static PiezaoPersonaje M286 = new PiezaoPersonaje(13, 27, "M286");
		//Muros 15va columna
	static PiezaoPersonaje M287 = new PiezaoPersonaje(14, 2, "M287");
	static PiezaoPersonaje M288 = new PiezaoPersonaje(14, 3, "M288");
	static PiezaoPersonaje M289 = new PiezaoPersonaje(14, 4, "M289");
	static PiezaoPersonaje M290 = new PiezaoPersonaje(14, 8, "M290");
	static PiezaoPersonaje M291 = new PiezaoPersonaje(14, 9, "M291");
	static PiezaoPersonaje M292 = new PiezaoPersonaje(14, 10, "M292");
	static PiezaoPersonaje M293 = new PiezaoPersonaje(14, 12, "M293");
	static PiezaoPersonaje M294 = new PiezaoPersonaje(14, 17, "M294");
	static PiezaoPersonaje M295 = new PiezaoPersonaje(14, 19, "M295");
	static PiezaoPersonaje M296 = new PiezaoPersonaje(14, 20, "M296");
	static PiezaoPersonaje M297 = new PiezaoPersonaje(14, 21, "M297");
		//Muros 16ta columna
	static PiezaoPersonaje M301 = new PiezaoPersonaje(15, 2, "M301");
	static PiezaoPersonaje M302 = new PiezaoPersonaje(15, 3, "M302");
	static PiezaoPersonaje M303 = new PiezaoPersonaje(15, 4, "M303");
	static PiezaoPersonaje M304 = new PiezaoPersonaje(15, 6, "M304");
	static PiezaoPersonaje M305 = new PiezaoPersonaje(15, 8, "M305");
	static PiezaoPersonaje M306 = new PiezaoPersonaje(15, 9, "M306");
	static PiezaoPersonaje M307 = new PiezaoPersonaje(15, 10, "M307");
	static PiezaoPersonaje M308 = new PiezaoPersonaje(15, 12, "M308");
	static PiezaoPersonaje M309 = new PiezaoPersonaje(15, 17, "M309");
	static PiezaoPersonaje M310 = new PiezaoPersonaje(15, 19, "M310");
	static PiezaoPersonaje M311 = new PiezaoPersonaje(15, 20, "M311");
	static PiezaoPersonaje M312 = new PiezaoPersonaje(15, 21, "M312");
	static PiezaoPersonaje M313 = new PiezaoPersonaje(15, 23, "M313");
	static PiezaoPersonaje M314 = new PiezaoPersonaje(15, 25, "M314");
	static PiezaoPersonaje M315 = new PiezaoPersonaje(15, 26, "M315");
	static PiezaoPersonaje M316 = new PiezaoPersonaje(15, 27, "M316");
		//Muros 17ta columna
	static PiezaoPersonaje M317 = new PiezaoPersonaje(16, 6, "M317");
	static PiezaoPersonaje M318 = new PiezaoPersonaje(16, 8, "M318");
	static PiezaoPersonaje M319 = new PiezaoPersonaje(16, 9, "M319");
	static PiezaoPersonaje M320 = new PiezaoPersonaje(16, 10, "M320");
	static PiezaoPersonaje M321 = new PiezaoPersonaje(16, 12, "M321");
	static PiezaoPersonaje M322 = new PiezaoPersonaje(16, 17, "M322");
	static PiezaoPersonaje M323 = new PiezaoPersonaje(16, 23, "M323");
	static PiezaoPersonaje M324 = new PiezaoPersonaje(16, 25, "M324");
	static PiezaoPersonaje M325 = new PiezaoPersonaje(16, 26, "M325");
	static PiezaoPersonaje M326 = new PiezaoPersonaje(16, 27, "M326");
		//Muros 18va columna
	static PiezaoPersonaje M328 = new PiezaoPersonaje(17, 2, "M328");
	static PiezaoPersonaje M329 = new PiezaoPersonaje(17, 3, "M329");
	static PiezaoPersonaje M330 = new PiezaoPersonaje(17, 4, "M330");
	static PiezaoPersonaje M331 = new PiezaoPersonaje(17, 6, "M331");
	static PiezaoPersonaje M332 = new PiezaoPersonaje(17, 8, "M332");
	static PiezaoPersonaje M333 = new PiezaoPersonaje(17, 9, "M333");
	static PiezaoPersonaje M334 = new PiezaoPersonaje(17, 10, "M334");
	static PiezaoPersonaje M335 = new PiezaoPersonaje(17, 12, "M335");
	static PiezaoPersonaje M336 = new PiezaoPersonaje(17, 19, "M336");
	static PiezaoPersonaje M337 = new PiezaoPersonaje(17, 20, "M337");
	static PiezaoPersonaje M338 = new PiezaoPersonaje(17, 21, "M338");
	static PiezaoPersonaje M339 = new PiezaoPersonaje(17, 23, "M339");
		//Muros 19na columna
	static PiezaoPersonaje M341 = new PiezaoPersonaje(18, 2, "M341");
	static PiezaoPersonaje M342 = new PiezaoPersonaje(18, 3, "M342");
	static PiezaoPersonaje M343 = new PiezaoPersonaje(18, 4, "M343");
	static PiezaoPersonaje M344 = new PiezaoPersonaje(18, 6, "M344");
	static PiezaoPersonaje M345 = new PiezaoPersonaje(18, 12, "M345");
	static PiezaoPersonaje M346 = new PiezaoPersonaje(18, 13, "M346");
	static PiezaoPersonaje M347 = new PiezaoPersonaje(18, 14, "M347");
	static PiezaoPersonaje M348 = new PiezaoPersonaje(18, 15, "M348");
	static PiezaoPersonaje M349 = new PiezaoPersonaje(18, 16, "M349");
	static PiezaoPersonaje M350 = new PiezaoPersonaje(18, 17, "M350");
	static PiezaoPersonaje M351 = new PiezaoPersonaje(18, 23, "M351");
	static PiezaoPersonaje M352 = new PiezaoPersonaje(18, 25, "M352");
	static PiezaoPersonaje M353 = new PiezaoPersonaje(18, 26, "M353");
	static PiezaoPersonaje M354 = new PiezaoPersonaje(18, 27, "M354");
		//Muros 20va columna
	static PiezaoPersonaje M355 = new PiezaoPersonaje(19, 2, "M355");
	static PiezaoPersonaje M356 = new PiezaoPersonaje(19, 3, "M356");
	static PiezaoPersonaje M357 = new PiezaoPersonaje(19, 4, "M357");
	static PiezaoPersonaje M358 = new PiezaoPersonaje(19, 6, "M358");
	static PiezaoPersonaje M359 = new PiezaoPersonaje(19, 8, "M359");
	static PiezaoPersonaje M360 = new PiezaoPersonaje(19, 10, "M360");
	static PiezaoPersonaje M361 = new PiezaoPersonaje(19, 19, "M361");
	static PiezaoPersonaje M362 = new PiezaoPersonaje(19, 21, "M362");
	static PiezaoPersonaje M363 = new PiezaoPersonaje(19, 23, "M363");
	static PiezaoPersonaje M364 = new PiezaoPersonaje(19, 25, "M364");
	static PiezaoPersonaje M365 = new PiezaoPersonaje(19, 26, "M365");
	static PiezaoPersonaje M366 = new PiezaoPersonaje(19, 27, "M366");
		//Muros 21va columna
	static PiezaoPersonaje M367 = new PiezaoPersonaje(20, 6, "M367");
	static PiezaoPersonaje M368 = new PiezaoPersonaje(20, 8, "M368");
	static PiezaoPersonaje M369 = new PiezaoPersonaje(20, 12, "M369");
	static PiezaoPersonaje M370 = new PiezaoPersonaje(20, 13, "M370");
	static PiezaoPersonaje M371 = new PiezaoPersonaje(20, 14, "M371");
	static PiezaoPersonaje M372 = new PiezaoPersonaje(20, 15, "M372");
	static PiezaoPersonaje M373 = new PiezaoPersonaje(20, 16, "M373");
	static PiezaoPersonaje M374 = new PiezaoPersonaje(20, 17, "M374");
	static PiezaoPersonaje M375 = new PiezaoPersonaje(20, 21, "M375");
	static PiezaoPersonaje M376 = new PiezaoPersonaje(20, 23, "M376");
	static PiezaoPersonaje M377 = new PiezaoPersonaje(20, 25, "M377");
	static PiezaoPersonaje M378 = new PiezaoPersonaje(20, 26, "M378");
	static PiezaoPersonaje M379 = new PiezaoPersonaje(20, 27, "M379");
		//Muros 22va columna
	static PiezaoPersonaje M380 = new PiezaoPersonaje(21, 2, "M380");
	static PiezaoPersonaje M381 = new PiezaoPersonaje(21, 3, "M381");
	static PiezaoPersonaje M382 = new PiezaoPersonaje(21, 4, "M382");
	static PiezaoPersonaje M383 = new PiezaoPersonaje(21, 6, "M383");
	static PiezaoPersonaje M384 = new PiezaoPersonaje(21, 8, "M384");
	static PiezaoPersonaje M385 = new PiezaoPersonaje(21, 9, "M385");
	static PiezaoPersonaje M386 = new PiezaoPersonaje(21, 10, "M386");
	static PiezaoPersonaje M387 = new PiezaoPersonaje(21, 12, "M387");
	static PiezaoPersonaje M388 = new PiezaoPersonaje(21, 13, "M388");
	static PiezaoPersonaje M389 = new PiezaoPersonaje(21, 14, "M389");
	static PiezaoPersonaje M390 = new PiezaoPersonaje(21, 15, "M390");
	static PiezaoPersonaje M391 = new PiezaoPersonaje(21, 16, "M391");
	static PiezaoPersonaje M392 = new PiezaoPersonaje(21, 17, "M392");
	static PiezaoPersonaje M393 = new PiezaoPersonaje(21, 19, "M393");
	static PiezaoPersonaje M394 = new PiezaoPersonaje(21, 20, "M394");
	static PiezaoPersonaje M395 = new PiezaoPersonaje(21, 21, "M395");
	static PiezaoPersonaje M396 = new PiezaoPersonaje(21, 23, "M396");
		//Muros 23va columna
	static PiezaoPersonaje M397 = new PiezaoPersonaje(22, 2, "M397");
	static PiezaoPersonaje M398 = new PiezaoPersonaje(22, 3, "M398");
	static PiezaoPersonaje M399 = new PiezaoPersonaje(22, 4, "M399");
	static PiezaoPersonaje M400 = new PiezaoPersonaje(22, 6, "M400");
	static PiezaoPersonaje M401 = new PiezaoPersonaje(22, 23, "M401");
	static PiezaoPersonaje M402 = new PiezaoPersonaje(22, 25, "M402");
	static PiezaoPersonaje M403 = new PiezaoPersonaje(22, 26, "M403");
	static PiezaoPersonaje M404 = new PiezaoPersonaje(22, 27, "M404");
		//Muros 24va columna
	static PiezaoPersonaje M405 = new PiezaoPersonaje(23, 2, "M405");
	static PiezaoPersonaje M406 = new PiezaoPersonaje(23, 3, "M406");
	static PiezaoPersonaje M407 = new PiezaoPersonaje(23, 4, "M407");
	static PiezaoPersonaje M408 = new PiezaoPersonaje(23, 6, "M408");
	static PiezaoPersonaje M409 = new PiezaoPersonaje(23, 7, "M409");
	static PiezaoPersonaje M410 = new PiezaoPersonaje(23, 8, "M410");
	static PiezaoPersonaje M411 = new PiezaoPersonaje(23, 9, "M411");
	static PiezaoPersonaje M412 = new PiezaoPersonaje(23, 10, "M412");
	static PiezaoPersonaje M413 = new PiezaoPersonaje(23, 11, "M413");

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
	static JLabel Muro235 = new JLabel();
	static JLabel Muro236 = new JLabel();
	static JLabel Muro237 = new JLabel();
	static JLabel Muro238 = new JLabel();
	static JLabel Muro239 = new JLabel();
	static JLabel Muro240 = new JLabel();
	static JLabel Muro241 = new JLabel();
	static JLabel Muro242 = new JLabel();
	static JLabel Muro243 = new JLabel();
	static JLabel Muro244 = new JLabel();
	static JLabel Muro245 = new JLabel();
	static JLabel Muro246 = new JLabel();
	static JLabel Muro247 = new JLabel();
	static JLabel Muro248 = new JLabel();
	static JLabel Muro249 = new JLabel();
	static JLabel Muro250 = new JLabel();
	static JLabel Muro251 = new JLabel();
	static JLabel Muro252 = new JLabel();
	static JLabel Muro253 = new JLabel();
	static JLabel Muro254 = new JLabel();
	static JLabel Muro255 = new JLabel();
	static JLabel Muro256 = new JLabel();
	static JLabel Muro257 = new JLabel();
	static JLabel Muro258 = new JLabel();
	static JLabel Muro259 = new JLabel();
	static JLabel Muro260 = new JLabel();
	static JLabel Muro261 = new JLabel();
	static JLabel Muro262 = new JLabel();
	static JLabel Muro263 = new JLabel();
	static JLabel Muro264 = new JLabel();
	static JLabel Muro265 = new JLabel();
	static JLabel Muro266 = new JLabel();
	static JLabel Muro267 = new JLabel();
	static JLabel Muro268 = new JLabel();
	static JLabel Muro269 = new JLabel();
	static JLabel Muro270 = new JLabel();
	static JLabel Muro271 = new JLabel();
	static JLabel Muro272 = new JLabel();
	static JLabel Muro273 = new JLabel();
	static JLabel Muro274 = new JLabel();
	static JLabel Muro275 = new JLabel();
	static JLabel Muro276 = new JLabel();
	static JLabel Muro277 = new JLabel();
	static JLabel Muro278 = new JLabel();
	static JLabel Muro279 = new JLabel();
	static JLabel Muro280 = new JLabel();
	static JLabel Muro281 = new JLabel();
	static JLabel Muro282 = new JLabel();
	static JLabel Muro283 = new JLabel();
	static JLabel Muro284 = new JLabel();
	static JLabel Muro285 = new JLabel();
	static JLabel Muro286 = new JLabel();
	static JLabel Muro287 = new JLabel();
	static JLabel Muro288 = new JLabel();
	static JLabel Muro289 = new JLabel();
	static JLabel Muro290 = new JLabel();
	static JLabel Muro291 = new JLabel();
	static JLabel Muro292 = new JLabel();
	static JLabel Muro293 = new JLabel();
	static JLabel Muro294 = new JLabel();
	static JLabel Muro295 = new JLabel();
	static JLabel Muro296 = new JLabel();
	static JLabel Muro297 = new JLabel();
	static JLabel Muro298 = new JLabel();
	static JLabel Muro299 = new JLabel();
	static JLabel Muro300 = new JLabel();
	static JLabel Muro301 = new JLabel();
	static JLabel Muro302 = new JLabel();
	static JLabel Muro303 = new JLabel();
	static JLabel Muro304 = new JLabel();
	static JLabel Muro305 = new JLabel();
	static JLabel Muro306 = new JLabel();
	static JLabel Muro307 = new JLabel();
	static JLabel Muro308 = new JLabel();
	static JLabel Muro309 = new JLabel();
	static JLabel Muro310 = new JLabel();
	static JLabel Muro311 = new JLabel();
	static JLabel Muro312 = new JLabel();
	static JLabel Muro313 = new JLabel();
	static JLabel Muro314 = new JLabel();
	static JLabel Muro315 = new JLabel();
	static JLabel Muro316 = new JLabel();
	static JLabel Muro317 = new JLabel();
	static JLabel Muro318 = new JLabel();
	static JLabel Muro319 = new JLabel();
	static JLabel Muro320 = new JLabel();
	static JLabel Muro321 = new JLabel();
	static JLabel Muro322 = new JLabel();
	static JLabel Muro323 = new JLabel();
	static JLabel Muro324 = new JLabel();
	static JLabel Muro325 = new JLabel();
	static JLabel Muro326 = new JLabel();
	static JLabel Muro327 = new JLabel();
	static JLabel Muro328 = new JLabel();
	static JLabel Muro329 = new JLabel();
	static JLabel Muro330 = new JLabel();
	static JLabel Muro331 = new JLabel();
	static JLabel Muro332 = new JLabel();
	static JLabel Muro333 = new JLabel();
	static JLabel Muro334 = new JLabel();
	static JLabel Muro335 = new JLabel();
	static JLabel Muro336 = new JLabel();
	static JLabel Muro337 = new JLabel();
	static JLabel Muro338 = new JLabel();
	static JLabel Muro339 = new JLabel();
	static JLabel Muro340 = new JLabel();
	static JLabel Muro341 = new JLabel();
	static JLabel Muro342 = new JLabel();
	static JLabel Muro343 = new JLabel();
	static JLabel Muro344 = new JLabel();
	static JLabel Muro345 = new JLabel();
	static JLabel Muro346 = new JLabel();
	static JLabel Muro347 = new JLabel();
	static JLabel Muro348 = new JLabel();
	static JLabel Muro349 = new JLabel();
	static JLabel Muro350 = new JLabel();
	static JLabel Muro351 = new JLabel();
	static JLabel Muro352 = new JLabel();
	static JLabel Muro353 = new JLabel();
	static JLabel Muro354 = new JLabel();
	static JLabel Muro355 = new JLabel();
	static JLabel Muro356 = new JLabel();
	static JLabel Muro357 = new JLabel();
	static JLabel Muro358 = new JLabel();
	static JLabel Muro359 = new JLabel();
	static JLabel Muro360 = new JLabel();
	static JLabel Muro361 = new JLabel();
	static JLabel Muro362 = new JLabel();
	static JLabel Muro363 = new JLabel();
	static JLabel Muro364 = new JLabel();
	static JLabel Muro365 = new JLabel();
	static JLabel Muro366 = new JLabel();
	static JLabel Muro367 = new JLabel();
	static JLabel Muro368 = new JLabel();
	static JLabel Muro369 = new JLabel();
	static JLabel Muro370 = new JLabel();
	static JLabel Muro371 = new JLabel();
	static JLabel Muro372 = new JLabel();
	static JLabel Muro373 = new JLabel();
	static JLabel Muro374 = new JLabel();
	static JLabel Muro375 = new JLabel();
	static JLabel Muro376 = new JLabel();
	static JLabel Muro377 = new JLabel();
	static JLabel Muro378 = new JLabel();
	static JLabel Muro379 = new JLabel();
	static JLabel Muro380 = new JLabel();
	static JLabel Muro381 = new JLabel();
	static JLabel Muro382 = new JLabel();
	static JLabel Muro383 = new JLabel();
	static JLabel Muro384 = new JLabel();
	static JLabel Muro385 = new JLabel();
	static JLabel Muro386 = new JLabel();
	static JLabel Muro387 = new JLabel();
	static JLabel Muro388 = new JLabel();
	static JLabel Muro389 = new JLabel();
	static JLabel Muro390 = new JLabel();
	static JLabel Muro391 = new JLabel();
	static JLabel Muro392 = new JLabel();
	static JLabel Muro393 = new JLabel();
	static JLabel Muro394 = new JLabel();
	static JLabel Muro395 = new JLabel();
	static JLabel Muro396 = new JLabel();
	
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
		Muro235.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro236.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro237.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro238.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro239.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro240.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro241.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro242.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro243.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro244.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro245.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro246.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro247.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro248.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro249.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro250.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro251.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro252.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro253.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro254.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro255.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro256.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro257.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro258.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro259.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro260.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro261.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro262.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro263.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro264.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro265.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro266.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro267.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro268.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro269.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro270.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro271.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro272.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro273.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro274.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro275.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro276.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro277.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro278.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro279.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro280.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro281.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro282.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro283.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro284.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro285.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro286.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro287.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro288.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro289.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro290.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro291.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro292.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro293.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro294.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro295.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro296.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro297.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro298.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro299.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro300.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro301.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro302.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro303.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro304.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro305.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro306.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro307.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro308.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro309.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro310.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro311.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro312.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro313.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro314.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro315.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro316.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro317.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro318.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro319.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro320.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro321.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro322.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro323.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro324.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro325.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro326.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro327.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro328.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro329.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro330.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro331.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro332.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro333.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro334.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro335.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro336.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro337.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro338.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro339.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro340.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro341.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro342.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro343.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro344.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro345.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro346.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro347.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro348.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro349.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro350.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro351.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro352.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro353.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro354.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro355.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro356.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro357.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro358.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro359.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro360.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro361.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro362.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro363.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro364.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro365.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro366.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro367.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro368.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro369.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro370.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro371.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro372.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro373.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro374.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro375.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro376.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro377.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro378.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro379.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro380.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro381.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro382.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro383.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro384.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro385.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro386.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro387.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro388.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro389.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro390.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro391.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro392.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro393.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro394.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro395.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		Muro396.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/muroPacMan.png")));
		
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
		VPM.add(Muro235);
		VPM.add(Muro236);
		VPM.add(Muro237);
		VPM.add(Muro238);
		VPM.add(Muro239);
		VPM.add(Muro240);
		VPM.add(Muro241);
		VPM.add(Muro242);
		VPM.add(Muro243);
		VPM.add(Muro244);
		VPM.add(Muro245);
		VPM.add(Muro246);
		VPM.add(Muro247);
		VPM.add(Muro248);
		VPM.add(Muro249);
		VPM.add(Muro250);
		VPM.add(Muro251);
		VPM.add(Muro252);
		VPM.add(Muro253);
		VPM.add(Muro254);
		VPM.add(Muro255);
		VPM.add(Muro256);
		VPM.add(Muro257);
		VPM.add(Muro258);
		VPM.add(Muro259);
		VPM.add(Muro260);
		VPM.add(Muro261);
		VPM.add(Muro262);
		VPM.add(Muro263);
		VPM.add(Muro264);
		VPM.add(Muro265);
		VPM.add(Muro266);
		VPM.add(Muro267);
		VPM.add(Muro268);
		VPM.add(Muro269);
		VPM.add(Muro270);
		VPM.add(Muro271);
		VPM.add(Muro272);
		VPM.add(Muro273);
		VPM.add(Muro274);
		VPM.add(Muro275);
		VPM.add(Muro276);
		VPM.add(Muro277);
		VPM.add(Muro278);
		VPM.add(Muro279);
		VPM.add(Muro280);
		VPM.add(Muro281);
		VPM.add(Muro282);
		VPM.add(Muro283);
		VPM.add(Muro284);
		VPM.add(Muro285);
		VPM.add(Muro286);
		VPM.add(Muro287);
		VPM.add(Muro288);
		VPM.add(Muro289);
		VPM.add(Muro290);
		VPM.add(Muro291);
		VPM.add(Muro292);
		VPM.add(Muro293);
		VPM.add(Muro294);
		VPM.add(Muro295);
		VPM.add(Muro296);
		VPM.add(Muro297);
		VPM.add(Muro298);
		VPM.add(Muro299);
		VPM.add(Muro300);
		VPM.add(Muro301);
		VPM.add(Muro302);
		VPM.add(Muro303);
		VPM.add(Muro304);
		VPM.add(Muro305);
		VPM.add(Muro306);
		VPM.add(Muro307);
		VPM.add(Muro308);
		VPM.add(Muro309);
		VPM.add(Muro310);
		VPM.add(Muro311);
		VPM.add(Muro312);
		VPM.add(Muro313);
		VPM.add(Muro314);
		VPM.add(Muro315);
		VPM.add(Muro316);
		VPM.add(Muro317);
		VPM.add(Muro318);
		VPM.add(Muro319);
		VPM.add(Muro320);
		VPM.add(Muro321);
		VPM.add(Muro322);
		VPM.add(Muro323);
		VPM.add(Muro324);
		VPM.add(Muro325);
		VPM.add(Muro326);
		VPM.add(Muro327);
		VPM.add(Muro328);
		VPM.add(Muro329);
		VPM.add(Muro330);
		VPM.add(Muro331);
		VPM.add(Muro332);
		VPM.add(Muro333);
		VPM.add(Muro334);
		VPM.add(Muro335);
		VPM.add(Muro336);
		VPM.add(Muro337);
		VPM.add(Muro338);
		VPM.add(Muro339);
		VPM.add(Muro340);
		VPM.add(Muro341);
		VPM.add(Muro342);
		VPM.add(Muro343);
		VPM.add(Muro344);
		VPM.add(Muro345);
		VPM.add(Muro346);
		VPM.add(Muro347);
		VPM.add(Muro348);
		VPM.add(Muro349);
		VPM.add(Muro350);
		VPM.add(Muro351);
		VPM.add(Muro352);
		VPM.add(Muro353);
		VPM.add(Muro354);
		VPM.add(Muro355);
		VPM.add(Muro356);
		VPM.add(Muro357);
		VPM.add(Muro358);
		VPM.add(Muro359);
		VPM.add(Muro360);
		VPM.add(Muro361);
		VPM.add(Muro362);
		VPM.add(Muro363);
		VPM.add(Muro364);
		VPM.add(Muro365);
		VPM.add(Muro366);
		VPM.add(Muro367);
		VPM.add(Muro368);
		VPM.add(Muro369);
		VPM.add(Muro370);
		VPM.add(Muro371);
		VPM.add(Muro372);
		VPM.add(Muro373);
		VPM.add(Muro374);
		VPM.add(Muro375);
		VPM.add(Muro376);
		VPM.add(Muro377);
		VPM.add(Muro378);
		VPM.add(Muro379);
		VPM.add(Muro380);
		VPM.add(Muro381);
		VPM.add(Muro382);
		VPM.add(Muro383);
		VPM.add(Muro384);
		VPM.add(Muro385);
		VPM.add(Muro386);
		VPM.add(Muro387);
		VPM.add(Muro388);
		VPM.add(Muro389);
		VPM.add(Muro390);
		VPM.add(Muro391);
		VPM.add(Muro392);
		VPM.add(Muro393);
		VPM.add(Muro394);
		VPM.add(Muro395);
		VPM.add(Muro396);
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
		objMostrados.add(M235);
		objMostrados.add(M236);
		objMostrados.add(M237);
		objMostrados.add(M238);
		objMostrados.add(M239);
		objMostrados.add(M240);
		objMostrados.add(M241);
		objMostrados.add(M242);
		objMostrados.add(M243);
		objMostrados.add(M244);
		objMostrados.add(M245);
		objMostrados.add(M246);
		objMostrados.add(M247);
		objMostrados.add(M248);
		objMostrados.add(M249);
		objMostrados.add(M250);
		objMostrados.add(M251);
		objMostrados.add(M252);
		objMostrados.add(M253);
		objMostrados.add(M254);
		objMostrados.add(M255);
		objMostrados.add(M256);
		objMostrados.add(M257);
		objMostrados.add(M258);
		objMostrados.add(M259);
		objMostrados.add(M260);
		objMostrados.add(M261);
		objMostrados.add(M262);
		objMostrados.add(M263);
		objMostrados.add(M264);
		objMostrados.add(M265);
		objMostrados.add(M266);
		objMostrados.add(M267);
		objMostrados.add(M268);
		objMostrados.add(M269);
		objMostrados.add(M270);
		objMostrados.add(M271);
		objMostrados.add(M272);
		objMostrados.add(M273);
		objMostrados.add(M274);
		objMostrados.add(M275);
		objMostrados.add(M276);
		objMostrados.add(M277);
		objMostrados.add(M278);
		objMostrados.add(M279);
		objMostrados.add(M280);
		objMostrados.add(M281);
		objMostrados.add(M282);
		objMostrados.add(M283);
		objMostrados.add(M284);
		objMostrados.add(M285);
		objMostrados.add(M286);
		objMostrados.add(M287);
		objMostrados.add(M288);
		objMostrados.add(M289);
		objMostrados.add(M290);
		objMostrados.add(M291);
		objMostrados.add(M292);
		objMostrados.add(M293);
		objMostrados.add(M294);
		objMostrados.add(M295);
		objMostrados.add(M296);
		objMostrados.add(M297);
		objMostrados.add(M301);
		objMostrados.add(M302);
		objMostrados.add(M303);
		objMostrados.add(M304);
		objMostrados.add(M305);
		objMostrados.add(M306);
		objMostrados.add(M307);
		objMostrados.add(M308);
		objMostrados.add(M309);
		objMostrados.add(M310);
		objMostrados.add(M311);
		objMostrados.add(M312);
		objMostrados.add(M313);
		objMostrados.add(M314);
		objMostrados.add(M315);
		objMostrados.add(M316);
		objMostrados.add(M317);
		objMostrados.add(M318);
		objMostrados.add(M319);
		objMostrados.add(M320);
		objMostrados.add(M321);
		objMostrados.add(M322);
		objMostrados.add(M323);
		objMostrados.add(M324);
		objMostrados.add(M325);
		objMostrados.add(M326);
		objMostrados.add(M328);
		objMostrados.add(M329);
		objMostrados.add(M330);
		objMostrados.add(M331);
		objMostrados.add(M332);
		objMostrados.add(M333);
		objMostrados.add(M334);
		objMostrados.add(M335);
		objMostrados.add(M336);
		objMostrados.add(M337);
		objMostrados.add(M338);
		objMostrados.add(M339);
		objMostrados.add(M341);
		objMostrados.add(M342);
		objMostrados.add(M343);
		objMostrados.add(M344);
		objMostrados.add(M345);
		objMostrados.add(M346);
		objMostrados.add(M347);
		objMostrados.add(M348);
		objMostrados.add(M349);
		objMostrados.add(M350);
		objMostrados.add(M351);
		objMostrados.add(M352);
		objMostrados.add(M353);
		objMostrados.add(M354);
		objMostrados.add(M355);
		objMostrados.add(M356);
		objMostrados.add(M357);
		objMostrados.add(M358);
		objMostrados.add(M359);
		objMostrados.add(M360);
		objMostrados.add(M361);
		objMostrados.add(M362);
		objMostrados.add(M363);
		objMostrados.add(M364);
		objMostrados.add(M365);
		objMostrados.add(M366);
		objMostrados.add(M367);
		objMostrados.add(M368);
		objMostrados.add(M369);
		objMostrados.add(M370);
		objMostrados.add(M371);
		objMostrados.add(M372);
		objMostrados.add(M373);
		objMostrados.add(M374);
		objMostrados.add(M375);
		objMostrados.add(M376);
		objMostrados.add(M377);
		objMostrados.add(M378);
		objMostrados.add(M379);
		objMostrados.add(M380);
		objMostrados.add(M381);
		objMostrados.add(M382);
		objMostrados.add(M383);
		objMostrados.add(M384);
		objMostrados.add(M385);
		objMostrados.add(M386);
		objMostrados.add(M387);
		objMostrados.add(M388);
		objMostrados.add(M389);
		objMostrados.add(M390);
		objMostrados.add(M391);
		objMostrados.add(M392);
		objMostrados.add(M393);
		objMostrados.add(M394);
		objMostrados.add(M395);
		objMostrados.add(M396);
		
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
		Muro235.setBounds(M235.getCoorX()*20, M235.getCoorY()*20, 20, 20);
		Muro236.setBounds(M236.getCoorX()*20, M236.getCoorY()*20, 20, 20);
		Muro237.setBounds(M237.getCoorX()*20, M237.getCoorY()*20, 20, 20);
		Muro238.setBounds(M238.getCoorX()*20, M238.getCoorY()*20, 20, 20);
		Muro239.setBounds(M239.getCoorX()*20, M239.getCoorY()*20, 20, 20);
		Muro240.setBounds(M240.getCoorX()*20, M240.getCoorY()*20, 20, 20);
		Muro241.setBounds(M241.getCoorX()*20, M241.getCoorY()*20, 20, 20);
		Muro242.setBounds(M242.getCoorX()*20, M242.getCoorY()*20, 20, 20);
		Muro243.setBounds(M243.getCoorX()*20, M243.getCoorY()*20, 20, 20);
		Muro244.setBounds(M244.getCoorX()*20, M244.getCoorY()*20, 20, 20);
		Muro245.setBounds(M245.getCoorX()*20, M245.getCoorY()*20, 20, 20);
		Muro246.setBounds(M246.getCoorX()*20, M246.getCoorY()*20, 20, 20);
		Muro247.setBounds(M247.getCoorX()*20, M247.getCoorY()*20, 20, 20);
		Muro248.setBounds(M248.getCoorX()*20, M248.getCoorY()*20, 20, 20);
		Muro249.setBounds(M249.getCoorX()*20, M249.getCoorY()*20, 20, 20);
		Muro250.setBounds(M250.getCoorX()*20, M250.getCoorY()*20, 20, 20);
		Muro251.setBounds(M251.getCoorX()*20, M251.getCoorY()*20, 20, 20);
		Muro252.setBounds(M252.getCoorX()*20, M252.getCoorY()*20, 20, 20);
		Muro253.setBounds(M253.getCoorX()*20, M253.getCoorY()*20, 20, 20);
		Muro254.setBounds(M254.getCoorX()*20, M254.getCoorY()*20, 20, 20);
		Muro255.setBounds(M255.getCoorX()*20, M255.getCoorY()*20, 20, 20);
		Muro256.setBounds(M256.getCoorX()*20, M256.getCoorY()*20, 20, 20);
		Muro257.setBounds(M257.getCoorX()*20, M257.getCoorY()*20, 20, 20);
		Muro258.setBounds(M258.getCoorX()*20, M258.getCoorY()*20, 20, 20);
		Muro259.setBounds(M259.getCoorX()*20, M259.getCoorY()*20, 20, 20);
		Muro260.setBounds(M260.getCoorX()*20, M260.getCoorY()*20, 20, 20);
		Muro261.setBounds(M261.getCoorX()*20, M261.getCoorY()*20, 20, 20);
		Muro262.setBounds(M262.getCoorX()*20, M262.getCoorY()*20, 20, 20);
		Muro263.setBounds(M263.getCoorX()*20, M263.getCoorY()*20, 20, 20);
		Muro264.setBounds(M264.getCoorX()*20, M264.getCoorY()*20, 20, 20);
		Muro265.setBounds(M265.getCoorX()*20, M265.getCoorY()*20, 20, 20);
		Muro266.setBounds(M266.getCoorX()*20, M266.getCoorY()*20, 20, 20);
		Muro267.setBounds(M267.getCoorX()*20, M267.getCoorY()*20, 20, 20);
		Muro268.setBounds(M268.getCoorX()*20, M268.getCoorY()*20, 20, 20);
		Muro269.setBounds(M269.getCoorX()*20, M269.getCoorY()*20, 20, 20);
		Muro270.setBounds(M270.getCoorX()*20, M270.getCoorY()*20, 20, 20);
		Muro271.setBounds(M271.getCoorX()*20, M271.getCoorY()*20, 20, 20);
		Muro272.setBounds(M272.getCoorX()*20, M272.getCoorY()*20, 20, 20);
		Muro273.setBounds(M273.getCoorX()*20, M273.getCoorY()*20, 20, 20);
		Muro274.setBounds(M274.getCoorX()*20, M274.getCoorY()*20, 20, 20);
		Muro275.setBounds(M275.getCoorX()*20, M275.getCoorY()*20, 20, 20);
		Muro276.setBounds(M276.getCoorX()*20, M276.getCoorY()*20, 20, 20);
		Muro277.setBounds(M277.getCoorX()*20, M277.getCoorY()*20, 20, 20);
		Muro278.setBounds(M278.getCoorX()*20, M278.getCoorY()*20, 20, 20);
		Muro279.setBounds(M279.getCoorX()*20, M279.getCoorY()*20, 20, 20);
		Muro280.setBounds(M280.getCoorX()*20, M280.getCoorY()*20, 20, 20);
		Muro281.setBounds(M281.getCoorX()*20, M281.getCoorY()*20, 20, 20);
		Muro282.setBounds(M282.getCoorX()*20, M282.getCoorY()*20, 20, 20);
		Muro283.setBounds(M283.getCoorX()*20, M283.getCoorY()*20, 20, 20);
		Muro284.setBounds(M284.getCoorX()*20, M284.getCoorY()*20, 20, 20);
		Muro285.setBounds(M285.getCoorX()*20, M285.getCoorY()*20, 20, 20);
		Muro286.setBounds(M286.getCoorX()*20, M286.getCoorY()*20, 20, 20);
		Muro287.setBounds(M287.getCoorX()*20, M287.getCoorY()*20, 20, 20);
		Muro288.setBounds(M288.getCoorX()*20, M288.getCoorY()*20, 20, 20);
		Muro289.setBounds(M289.getCoorX()*20, M289.getCoorY()*20, 20, 20);
		Muro290.setBounds(M290.getCoorX()*20, M290.getCoorY()*20, 20, 20);
		Muro291.setBounds(M291.getCoorX()*20, M291.getCoorY()*20, 20, 20);
		Muro292.setBounds(M292.getCoorX()*20, M292.getCoorY()*20, 20, 20);
		Muro293.setBounds(M293.getCoorX()*20, M293.getCoorY()*20, 20, 20);
		Muro294.setBounds(M294.getCoorX()*20, M294.getCoorY()*20, 20, 20);
		Muro295.setBounds(M295.getCoorX()*20, M295.getCoorY()*20, 20, 20);
		Muro296.setBounds(M296.getCoorX()*20, M296.getCoorY()*20, 20, 20);
		Muro297.setBounds(M297.getCoorX()*20, M297.getCoorY()*20, 20, 20);
		Muro301.setBounds(M301.getCoorX()*20, M301.getCoorY()*20, 20, 20);
		Muro302.setBounds(M302.getCoorX()*20, M302.getCoorY()*20, 20, 20);
		Muro303.setBounds(M303.getCoorX()*20, M303.getCoorY()*20, 20, 20);
		Muro304.setBounds(M304.getCoorX()*20, M304.getCoorY()*20, 20, 20);
		Muro305.setBounds(M305.getCoorX()*20, M305.getCoorY()*20, 20, 20);
		Muro306.setBounds(M306.getCoorX()*20, M306.getCoorY()*20, 20, 20);
		Muro307.setBounds(M307.getCoorX()*20, M307.getCoorY()*20, 20, 20);
		Muro308.setBounds(M308.getCoorX()*20, M308.getCoorY()*20, 20, 20);
		Muro309.setBounds(M309.getCoorX()*20, M309.getCoorY()*20, 20, 20);
		Muro310.setBounds(M310.getCoorX()*20, M310.getCoorY()*20, 20, 20);
		Muro311.setBounds(M311.getCoorX()*20, M311.getCoorY()*20, 20, 20);
		Muro312.setBounds(M312.getCoorX()*20, M312.getCoorY()*20, 20, 20);
		Muro313.setBounds(M313.getCoorX()*20, M313.getCoorY()*20, 20, 20);
		Muro314.setBounds(M314.getCoorX()*20, M314.getCoorY()*20, 20, 20);
		Muro315.setBounds(M315.getCoorX()*20, M315.getCoorY()*20, 20, 20);
		Muro316.setBounds(M316.getCoorX()*20, M316.getCoorY()*20, 20, 20);
		Muro317.setBounds(M317.getCoorX()*20, M317.getCoorY()*20, 20, 20);
		Muro318.setBounds(M318.getCoorX()*20, M318.getCoorY()*20, 20, 20);
		Muro319.setBounds(M319.getCoorX()*20, M319.getCoorY()*20, 20, 20);
		Muro320.setBounds(M320.getCoorX()*20, M320.getCoorY()*20, 20, 20);
		Muro321.setBounds(M321.getCoorX()*20, M321.getCoorY()*20, 20, 20);
		Muro322.setBounds(M322.getCoorX()*20, M322.getCoorY()*20, 20, 20);
		Muro323.setBounds(M323.getCoorX()*20, M323.getCoorY()*20, 20, 20);
		Muro324.setBounds(M324.getCoorX()*20, M324.getCoorY()*20, 20, 20);
		Muro325.setBounds(M325.getCoorX()*20, M325.getCoorY()*20, 20, 20);
		Muro326.setBounds(M326.getCoorX()*20, M326.getCoorY()*20, 20, 20);
		Muro328.setBounds(M328.getCoorX()*20, M328.getCoorY()*20, 20, 20);
		Muro329.setBounds(M329.getCoorX()*20, M329.getCoorY()*20, 20, 20);
		Muro330.setBounds(M330.getCoorX()*20, M330.getCoorY()*20, 20, 20);
		Muro331.setBounds(M331.getCoorX()*20, M331.getCoorY()*20, 20, 20);
		Muro332.setBounds(M332.getCoorX()*20, M332.getCoorY()*20, 20, 20);
		Muro333.setBounds(M333.getCoorX()*20, M333.getCoorY()*20, 20, 20);
		Muro334.setBounds(M334.getCoorX()*20, M334.getCoorY()*20, 20, 20);
		Muro335.setBounds(M335.getCoorX()*20, M335.getCoorY()*20, 20, 20);
		Muro336.setBounds(M336.getCoorX()*20, M336.getCoorY()*20, 20, 20);
		Muro337.setBounds(M337.getCoorX()*20, M337.getCoorY()*20, 20, 20);
		Muro338.setBounds(M338.getCoorX()*20, M338.getCoorY()*20, 20, 20);
		Muro339.setBounds(M339.getCoorX()*20, M339.getCoorY()*20, 20, 20);
		Muro341.setBounds(M341.getCoorX()*20, M341.getCoorY()*20, 20, 20);
		Muro342.setBounds(M342.getCoorX()*20, M342.getCoorY()*20, 20, 20);
		Muro343.setBounds(M343.getCoorX()*20, M343.getCoorY()*20, 20, 20);
		Muro344.setBounds(M344.getCoorX()*20, M344.getCoorY()*20, 20, 20);
		Muro345.setBounds(M345.getCoorX()*20, M345.getCoorY()*20, 20, 20);
		Muro346.setBounds(M346.getCoorX()*20, M346.getCoorY()*20, 20, 20);
		Muro347.setBounds(M347.getCoorX()*20, M347.getCoorY()*20, 20, 20);
		Muro348.setBounds(M348.getCoorX()*20, M348.getCoorY()*20, 20, 20);
		Muro349.setBounds(M349.getCoorX()*20, M349.getCoorY()*20, 20, 20);
		Muro350.setBounds(M350.getCoorX()*20, M350.getCoorY()*20, 20, 20);
		Muro351.setBounds(M351.getCoorX()*20, M351.getCoorY()*20, 20, 20);
		Muro352.setBounds(M352.getCoorX()*20, M352.getCoorY()*20, 20, 20);
		Muro353.setBounds(M353.getCoorX()*20, M353.getCoorY()*20, 20, 20);
		Muro354.setBounds(M354.getCoorX()*20, M354.getCoorY()*20, 20, 20);
		Muro355.setBounds(M355.getCoorX()*20, M355.getCoorY()*20, 20, 20);
		Muro356.setBounds(M356.getCoorX()*20, M356.getCoorY()*20, 20, 20);
		Muro357.setBounds(M357.getCoorX()*20, M357.getCoorY()*20, 20, 20);
		Muro358.setBounds(M358.getCoorX()*20, M358.getCoorY()*20, 20, 20);
		Muro359.setBounds(M359.getCoorX()*20, M359.getCoorY()*20, 20, 20);
		Muro360.setBounds(M360.getCoorX()*20, M360.getCoorY()*20, 20, 20);
		Muro361.setBounds(M361.getCoorX()*20, M361.getCoorY()*20, 20, 20);
		Muro362.setBounds(M362.getCoorX()*20, M362.getCoorY()*20, 20, 20);
		Muro363.setBounds(M363.getCoorX()*20, M363.getCoorY()*20, 20, 20);
		Muro364.setBounds(M364.getCoorX()*20, M364.getCoorY()*20, 20, 20);
		Muro365.setBounds(M365.getCoorX()*20, M365.getCoorY()*20, 20, 20);
		Muro366.setBounds(M366.getCoorX()*20, M366.getCoorY()*20, 20, 20);
		Muro367.setBounds(M367.getCoorX()*20, M367.getCoorY()*20, 20, 20);
		Muro368.setBounds(M368.getCoorX()*20, M368.getCoorY()*20, 20, 20);
		Muro369.setBounds(M369.getCoorX()*20, M369.getCoorY()*20, 20, 20);
		Muro370.setBounds(M370.getCoorX()*20, M370.getCoorY()*20, 20, 20);
		Muro371.setBounds(M371.getCoorX()*20, M371.getCoorY()*20, 20, 20);
		Muro372.setBounds(M372.getCoorX()*20, M372.getCoorY()*20, 20, 20);
		Muro373.setBounds(M373.getCoorX()*20, M373.getCoorY()*20, 20, 20);
		Muro374.setBounds(M374.getCoorX()*20, M374.getCoorY()*20, 20, 20);
		Muro375.setBounds(M375.getCoorX()*20, M375.getCoorY()*20, 20, 20);
		Muro376.setBounds(M376.getCoorX()*20, M376.getCoorY()*20, 20, 20);
		Muro377.setBounds(M377.getCoorX()*20, M377.getCoorY()*20, 20, 20);
		Muro378.setBounds(M378.getCoorX()*20, M378.getCoorY()*20, 20, 20);
		Muro379.setBounds(M379.getCoorX()*20, M379.getCoorY()*20, 20, 20);
		Muro380.setBounds(M380.getCoorX()*20, M380.getCoorY()*20, 20, 20);
		Muro381.setBounds(M381.getCoorX()*20, M381.getCoorY()*20, 20, 20);
		Muro382.setBounds(M382.getCoorX()*20, M382.getCoorY()*20, 20, 20);
		Muro383.setBounds(M383.getCoorX()*20, M383.getCoorY()*20, 20, 20);
		Muro384.setBounds(M384.getCoorX()*20, M384.getCoorY()*20, 20, 20);
		Muro385.setBounds(M385.getCoorX()*20, M385.getCoorY()*20, 20, 20);
		Muro386.setBounds(M386.getCoorX()*20, M386.getCoorY()*20, 20, 20);
		Muro387.setBounds(M387.getCoorX()*20, M387.getCoorY()*20, 20, 20);
		Muro388.setBounds(M388.getCoorX()*20, M388.getCoorY()*20, 20, 20);
		Muro389.setBounds(M389.getCoorX()*20, M389.getCoorY()*20, 20, 20);
		Muro390.setBounds(M390.getCoorX()*20, M390.getCoorY()*20, 20, 20);
		Muro391.setBounds(M391.getCoorX()*20, M391.getCoorY()*20, 20, 20);
		Muro392.setBounds(M392.getCoorX()*20, M392.getCoorY()*20, 20, 20);
		Muro393.setBounds(M393.getCoorX()*20, M393.getCoorY()*20, 20, 20);
		Muro394.setBounds(M394.getCoorX()*20, M394.getCoorY()*20, 20, 20);
		Muro395.setBounds(M395.getCoorX()*20, M395.getCoorY()*20, 20, 20);
		Muro396.setBounds(M396.getCoorX()*20, M396.getCoorY()*20, 20, 20);
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