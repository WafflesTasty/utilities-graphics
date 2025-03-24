package waffles.utils.sys.input.keyboard;

import waffles.utils.sys.input.IOKeyboard;

/**
 * A {@code KeyCode} is generated by input from an {@code IOKeyboard}.
 *
 * @author Waffles
 * @since Jun 25, 2015
 * @version 1.0
 * 
 * 
 * @see IOKeyboard
 */
public enum KeyCode
{
	/**
	 * The F1 key.
	 */
	F1, 
	/**
	 * The F2 key.
	 */
	F2, 
	/**
	 * The F3 key.
	 */
	F3, 
	/**
	 * The F4 key.
	 */
	F4, 
	/**
	 * The F5 key.
	 */
	F5, 
	/**
	 * The F6 key.
	 */
	F6, 
	/**
	 * The F7 key.
	 */
	F7, 
	/**
	 * The F8 key.
	 */
	F8, 
	/**
	 * The F9 key.
	 */
	F9, 
	/**
	 * The F10 key.
	 */
	F10, 
	/**
	 * The F11 key.
	 */
	F11, 
	/**
	 * The F12 key.
	 */
	F12, 
	/**
	 * The F13 key.
	 */
	F13, 
	/**
	 * The F14 key.
	 */
	F14, 
	/**
	 * The F15 key.
	 */
	F15, 
	/**
	 * The F16 key.
	 */
	F16, 
	/**
	 * The F17 key.
	 */
	F17, 
	/**
	 * The F18 key.
	 */
	F18, 
	/**
	 * The F19 key.
	 */
	F19, 
	/**
	 * The F20 key.
	 */
	F20, 
	/**
	 * The F21 key.
	 */
	F21, 
	/**
	 * The F22 key.
	 */
	F22, 
	/**
	 * The F23 key.
	 */
	F23, 
	/**
	 * The F24 key.
	 */
	F24, 
	
	/**
	 * The 0 key.
	 */		
	DIGIT0, 
	/**
	 * The 1 key.
	 */
	DIGIT1, 
	/**
	 * The 2 key.
	 */
	DIGIT2, 
	/**
	 * The 3 key.
	 */
	DIGIT3, 
	/**
	 * The 4 key.
	 */
	DIGIT4, 
	/**
	 * The 5 key.
	 */
	DIGIT5, 
	/**
	 * The 6 key.
	 */
	DIGIT6, 
	/**
	 * The 7 key.
	 */
	DIGIT7, 
	/**
	 * The 8 key.
	 */
	DIGIT8, 
	/**
	 * The 9 key.
	 */
	DIGIT9, 
	
	/**
	 * The A key.
	 */
	A,
	/**
	 * The B key.
	 */
	B,
	/**
	 * The C key.
	 */
	C,
	/**
	 * The D key.
	 */
	D,
	/**
	 * The E key.
	 */
	E,
	/**
	 * The F key.
	 */
	F,
	/**
	 * The G key.
	 */
	G,
	/**
	 * The H key.
	 */
	H,
	/**
	 * The I key.
	 */
	I,
	/**
	 * The J key.
	 */
	J,
	/**
	 * The K key.
	 */
	K,
	/**
	 * The L key.
	 */
	L,
	/**
	 * The M key.
	 */
	M,
	/**
	 * The N key.
	 */
	N,
	/**
	 * The O key.
	 */
	O,
	/**
	 * The P key.
	 */
	P,
	/**
	 * The Q key.
	 */
	Q,
	/**
	 * The R key.
	 */
	R,
	/**
	 * The S key.
	 */
	S,
	/**
	 * The T key.
	 */
	T,
	/**
	 * The U key.
	 */
	U,
	/**
	 * The V key.
	 */
	V,
	/**
	 * The W key.
	 */
	W,
	/**
	 * The X key.
	 */
	X,
	/**
	 * The Y key.
	 */
	Y,
	/**
	 * The Z key.
	 */
	Z, 
	
	/**
	 * The numpad 0 key.
	 */
	NUM_0,
	/**
	 * The numpad 1 key.
	 */
	NUM_1,
	/**
	 * The numpad 2 key.
	 */
	NUM_2,
	/**
	 * The numpad 3 key.
	 */
	NUM_3,
	/**
	 * The numpad 4 key.
	 */
	NUM_4,
	/**
	 * The numpad 5 key.
	 */
	NUM_5,
	/**
	 * The numpad 6 key.
	 */
	NUM_6,
	/**
	 * The numpad 7 key.
	 */
	NUM_7,
	/**
	 * The numpad 8 key.
	 */
	NUM_8,
	/**
	 * The numpad 9 key.
	 */
	NUM_9, 
	
	/**
	 * The numpad add key.
	 */
	NUM_ADD, 
	/**
	 * The numpad point key.
	 */
	NUM_DECIMAL, 
	/**
	 * The numpad divide key.
	 */
	NUM_DIVIDE, 
	/**
	 * The numpad enter key.
	 */
	NUM_ENTER, 
	/**
	 * The numpad multiply key.
	 */
	NUM_MULTIPLY, 
	/**
	 * The numpad subtract key.
	 */
	NUM_SUBTRACT, 
	/**
	 * The numpad lock key.
	 */
	NUM_LOCK, 
	
	/**
	 * The delete key.
	 */
	DELETE, 
	/**
	 * The end key.
	 */
	END, 
	/**
	 * The home key.
	 */
	HOME, 
	/**
	 * The insert key.
	 */
	INSERT,
	/**
	 * The page down key.
	 */
	PAGE_DOWN, 
	/**
	 * The page up key.
	 */
	PAGE_UP, 
	/**
	 * The pause key.
	 */
	PAUSE, 
	/**
	 * The print screen key.
	 */
	PRINT_SCREEN, 
	/**
	 * The scroll lock key.
	 */
	SCROLL_LOCK, 
	
	/**
	 * The down arrow key.
	 */
	DOWN, 
	/**
	 * The left arrow key.
	 */
	LEFT, 
	/**
	 * The right arrow key.
	 */
	RIGHT, 
	/**
	 * The up arrow key.
	 */
	UP, 
	
	/**
	 * The alt key.
	 */
	ALT, 
	/**
	 * The alt graph key.
	 */
	ALT_GRAPH, 
	/**
	 * The backspace key.
	 */
	BACK_SPACE, 
	/**
	 * The caps lock key.
	 */
	CAPS, 
	/**
	 * The control key.
	 */
	CONTROL, 
	/**
	 * The enter key.
	 */
	ENTER, 
	/**
	 * The escape key.
	 */
	ESCAPE, 
	/**
	 * The shift key.
	 */
	SHIFT, 
	/**
	 * The space key.
	 */
	SPACE, 
	/**
	 * The tab key.
	 */
	TAB, 
	
	/**
	 * The apostrophe key.
	 */
	APOSTROPHE,
	/**
	 * The back slash key.
	 */
	BACK_SLASH, 
	/**
	 * The left brace key.
	 */
	BRACELEFT,
	/**
	 * The right brace key.
	 */
	BRACERIGHT,
	/**
	 * The comma key.
	 */
	COMMA,
	/**
	 * The console key.
	 */
	CONSOLE,
	/**
	 * The context menu key.
	 */
	CONTEXT_MENU,
	/**
	 * The equals key.
	 */
	EQUALS, 
	/**
	 * The left parenthesis key.
	 */
	LEFT_PARENTHESIS, 
	/**
	 * The minus key.
	 */
	MINUS, 
	/**
	 * The period key.
	 */
	PERIOD, 
	/**
	 * The right parenthesis key.
	 */
	RIGHT_PARENTHESIS, 
	/**
	 * The semicolon key.
	 */
	SEMICOLON, 
	/**
	 * The slash key.
	 */
	SLASH, 
	
	/**
	 * An undefined key.
	 */
	UNDEFINED;
}