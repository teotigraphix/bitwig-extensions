package com.bitwig.extensions.controllers.arturia.keylab.mk2;

public enum Buttons
{
   CHORD(0x12),
   TRANS(0x13),
   OCT_MINUS(0x10),
   OCT_PLUS(0x11),
   PAD(0x17),
   CHORD_MEMORY(0x16),
   CHORD_TRANSPOSE(0x15),
   MIDI_CH(0x14),
   PAD1(0x70),
   PAD2(0x71),
   PAD3(0x72),
   PAD4(0x73),
   PAD5(0x74),
   PAD6(0x75),
   PAD7(0x76),
   PAD8(0x77),
   PAD9(0x78),
   PAD10(0x79),
   PAD11(0x7A),
   PAD12(0x7B),
   PAD13(0x7C),
   PAD14(0x7D),
   PAD15(0x7E),
   PAD16(0x7F),
   SOLO(0x60, 0x08),
   MUTE(0x61, 0x10),
   RECORD_ARM(0x62, 0x00),
   READ(0x63, 0x38),
   WRITE(0x64, 0x39),
   SAVE(0x65, 0x4A),
   PUNCH_IN(0x66, 0x57),
   PUNCH_OUT(0x67, 0x58),
   METRO(0x68, 0x59),
   UNDO(0x69, 0x51),
   REWIND(0x6A, 0x5B),
   FORWARD(0x6B, 0x5C),
   STOP(0x6C, 0x5D),
   PLAY_OR_PAUSE(0x6D, 0x5E),
   RECORD(0x6E, 0x5F),
   LOOP(0x6F, 0x56),
   CATEGORY(0x18, 0x65),
   PRESET(0x19, 0x64),
   PRESET_PREVIOUS(0x1A, 0x62),
   PRESET_NEXT(0x1B, 0x63),
   WHEEL_CLICK(0, 0x54),
   ANALOG_LAB(0x1C),
   DAW(0x1D),
   USER(0x1E),
   NEXT(0x1F, 0x31),
   PREVIOUS(0x20, 0x30),
   BANK(0x21, 0x21),
   SELECT1(0x22, 0x18),
   SELECT2(0x23, 0x19),
   SELECT3(0x24, 0x1A),
   SELECT4(0x25, 0x1B),
   SELECT5(0x26, 0x1C),
   SELECT6(0x27, 0x1D),
   SELECT7(0x28, 0x1E),
   SELECT8(0x29, 0x1F),
   SELECT_MULTI(0x2A, 0x33);

   Buttons(final int SysexId)
   {
      mSysexId = SysexId;
      mKey = 0;
   }

   Buttons(final int SysexId, final int noteOrCC)
   {
      mSysexId = SysexId;
      mKey = noteOrCC;
   }

   public static Buttons drumPad(int index)
   {
      switch (index)
      {
         case 0: return PAD1;
         case 1: return PAD2;
         case 2: return PAD3;
         case 3: return PAD4;
         case 4: return PAD5;
         case 5: return PAD6;
         case 6: return PAD7;
         case 7: return PAD8;
         case 8: return PAD9;
         case 9: return PAD10;
         case 10: return PAD11;
         case 11: return PAD12;
         case 12: return PAD13;
         case 13: return PAD14;
         case 14: return PAD15;
         case 15: return PAD16;
      }

      return null;
   }

   public int getSysexID()
   {
      return mSysexId;
   }

   public int getKey()
   {
      return mKey;
   }

   private final int mSysexId;

   private final int mKey;
}
