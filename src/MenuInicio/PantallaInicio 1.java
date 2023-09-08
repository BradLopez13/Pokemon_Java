����   ; �  Pantalla_combate/Combate  javax/swing/JFrame contentPane Ljavax/swing/JPanel; fondo LMenuInicio/FotoFondo; musica LMenuInicio/MusicaFondo; jugador Ljava/lang/String; contrincante vidaContrincante Ljavax/swing/JProgressBar; vidaJugador Informacion Ljavax/swing/JTextPane; Informacion1 <init> ()V Code
      MenuInicio/FotoFondo  /Imagenes/campoBatalla.png
     (Ljava/lang/String;)V	  !   # MenuInicio/MusicaFondo
 " 	  & 	 
	 ( * ) Pantalla_de_Eleccion/Eleccion +  	p_elegido	  -  	 ( / 0  
p_elegido2	  2   4 javax/swing/JProgressBar
 3 	  7  	  9   ; javax/swing/JTextPane
 : 	  >  	  @  
  B C D setDefaultCloseOperation (I)V
  F G H 	setBounds (IIII)V J javax/swing/JPanel
 I 	  M  
  O P Q setContentPane (Ljava/awt/Container;)V
 I S T U 	setLayout (Ljava/awt/LayoutManager;)V
  W X Y getContentPane ()Ljava/awt/Container;
 [ ] \ java/awt/Container ^ _ add *(Ljava/awt/Component;)Ljava/awt/Component;
  F
  S c javax/swing/JLabel
 b 
 b F
  ] h javax/swing/ImageIcon j java/lang/StringBuilder l /Pokemon_Back/
 i 
 i o p q append -(Ljava/lang/String;)Ljava/lang/StringBuilder; s _espalda.png
 i u v w toString ()Ljava/lang/String;
 y { z java/lang/Class | } getResource "(Ljava/lang/String;)Ljava/net/URL;
 g   � (Ljava/net/URL;)V
 b � � � setIcon (Ljavax/swing/Icon;)V � 
/Imagenes/ � -Pokemon.png
 3 � � D 
setMaximum
 3 � � D 
setMinimum	 � � � java/awt/Color � � GREEN Ljava/awt/Color;
 3 � � � setForeground (Ljava/awt/Color;)V
 3 F
 3 � � D setValue
 b  � java/awt/Font � Tahoma
 � �  � (Ljava/lang/String;II)V
 b � � � setFont (Ljava/awt/Font;)V
 b � � � 	setOpaque (Z)V	 � � � � BLACK
 b �	 � � � � 
LIGHT_GRAY
 b � � � setBackground
 : �
 : �
 : �
 : F � Pantalla_combate/AtaquesCombate
 � �  � (LPantalla_combate/Combate;)V
 � � �  Jugador LineNumberTable LocalVariableTable this LPantalla_combate/Combate; pokemon1 Ljavax/swing/JLabel; pokemon2 Tablero Tablero1 ataque !LPantalla_combate/AtaquesCombate; 	playMusic
 " � � D setFile
 " � �  play
 " � �  loop i I stop
 " � �  	playSound 
SourceFile Combate.java !     	              	 
                                              <    �*� *� Y� �  *� "Y� $� %*� '� ,*� .� 1*� 3Y� 5� 6*� 3Y� 5� 8*� :Y� <� =*� :Y� <� ?*� A*ddT�� E*� IY� K� L**� L� N*� L� R*� V*�  � ZW*�  DѶ `*�  � a� bY� dL+lfk`� e*�  +� fW+� gY(� iYk� m*� ,� nr� n� t� x� ~� �� bY� dM,+ �k`� e*�  ,� fW,� gY(� iY�� m*� 1� n�� n� t� x� ~� �*� 6,� �*� 6� �*� 6� �� �*� 6 �J �� �*�  *� 6� fW*� 6,� �*� 8,� �*� 8� �*