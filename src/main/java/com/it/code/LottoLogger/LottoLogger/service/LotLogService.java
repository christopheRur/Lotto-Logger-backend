package com.it.code.LottoLogger.LottoLogger.service;

import com.it.code.LottoLogger.LottoLogger.entity.LottoPlay;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface LotLogService {

    public LottoPlay addLottoPlay(LottoPlay lottoPlay);

    public LottoPlay getLottoPlay(String lotto);
    public List<LottoPlay> getLottoPlayList();

    public Integer[] getMegaBalls(String gameName);
    public Integer[] getPowerBalls(String gameName);

    public Integer[] generateMegaNumber();
    public Integer[] generatePowerNumber();

    public int generatePowerBalls();
    public int generateMegaBalls();
    public int generateGoldenBall();
    public int generateRedBall();
    public LottoPlay addMegaPowerSequence(String gameName, Set<Integer> megaPowSeq, int generatedBall, int lastBall);



}
