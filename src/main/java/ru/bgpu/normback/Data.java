package ru.bgpu.normback;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String interval;
    @Column(columnDefinition = "TEXT")
    private String size;
    @Column(columnDefinition = "TEXT")
    private String font;
    @Column(columnDefinition = "TEXT")
    private String color;
    @Column(columnDefinition = "TEXT")
    private String right_field;
    @Column(columnDefinition = "TEXT")
    private String left_field;
    @Column(columnDefinition = "TEXT")
    private String upper;
    @Column(columnDefinition = "TEXT")
    private String lower;
    @Column(columnDefinition = "TEXT")
    private String indent;
    @Column(columnDefinition = "TEXT")
    private String distanceChapter;
    @Column(columnDefinition = "TEXT")
    private String distanceParagraph;
    private boolean switchNumbering;
    @Column(columnDefinition = "TEXT")
    private String number;
    @Column(columnDefinition = "TEXT")
    private String number1;
    @Column(columnDefinition = "TEXT")
    private String numberPr1;
    @Column(columnDefinition = "TEXT")
    private String number2;
    @Column(columnDefinition = "TEXT")
    private String numberPr2;
    @Column(columnDefinition = "TEXT")
    private String number3;
    @Column(columnDefinition = "TEXT")
    private String numberPr3;
    private boolean number4;
    @Column(columnDefinition = "TEXT")
    private String numberPr4;
    @Column(columnDefinition = "TEXT")
    private String number5;
    @Column(columnDefinition = "TEXT")
    private String number6;
    @Column(columnDefinition = "TEXT")
    private String number7;
    @Column(columnDefinition = "TEXT")
    private String number8;
    @Column(columnDefinition = "TEXT")
    private String numberPr8;
    private boolean number9;
    @Column(columnDefinition = "TEXT")
    private String numberPr9;
    private boolean number10;
    @Column(columnDefinition = "TEXT")
    private String numberPr10;
    @Column(columnDefinition = "TEXT")
    private String findingTable;
    @Column(columnDefinition = "TEXT")
    private String tableName;
    private boolean columnNumber;
    @Column(columnDefinition = "TEXT")
    private String indicatorNumber;
    @Column(columnDefinition = "TEXT")
    private String interruptionTable;
    @Column(columnDefinition = "TEXT")
    private String littleTable;
    @Column(columnDefinition = "TEXT")
    private String tableNumber;
    @Column(columnDefinition = "TEXT")
    private String additionTable;
    @Column(columnDefinition = "TEXT")
    private String minHeight;
    @Column(columnDefinition = "TEXT")
    private String generalData;
    @Column(columnDefinition = "TEXT")
    private String tableText;
    @Column(columnDefinition = "TEXT")
    private String illustrationNumber;
    @Column(columnDefinition = "TEXT")
    private String illustrationNumberPr;
    @Column(columnDefinition = "TEXT")
    private String illustrationAddition;
    @Column(columnDefinition = "TEXT")
    private String illustrationAdditionPr;
    @Column(columnDefinition = "TEXT")
    private String illustrationChapter;
    @Column(columnDefinition = "TEXT")
    private String illustrationChapterPr;
    @Column(columnDefinition = "TEXT")
    private String illustrationText;
    @Column(columnDefinition = "TEXT")
    private String illustrationLink;
    @Column(columnDefinition = "TEXT")
    private String illustrationName;
    @Column(columnDefinition = "TEXT")
    private String illustrationNamePr;
    @Column(columnDefinition = "TEXT")
    private String formulaLocation;
    @Column(columnDefinition = "TEXT")
    private String formulaNumber;
    @Column(columnDefinition = "TEXT")
    private String formulaNumberPr;
    @Column(columnDefinition = "TEXT")
    private String formulaLink;
    @Column(columnDefinition = "TEXT")
    private String formulaLinkPr;
    @Column(columnDefinition = "TEXT")
    private String formulaAddition;
    @Column(columnDefinition = "TEXT")
    private String formulaAdditionPr;
    @Column(columnDefinition = "TEXT")
    private String formulaNumberChapter;
    @Column(columnDefinition = "TEXT")
    private String formulaNumberChapterPr;
    @Column(columnDefinition = "TEXT")
    private String chemicalFormula;
    @Column(columnDefinition = "TEXT")
    private String chemicalFormulaPr;
    @Column(columnDefinition = "TEXT")
    private String chemicalBonds;
    @Column(columnDefinition = "TEXT")
    private String chemicalBondsPr;

}
