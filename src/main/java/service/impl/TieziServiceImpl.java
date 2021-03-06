package service.impl;

import dao.TieziDao;
import dao.impl.TieziDaoImpl;
import entity.Tiezi;
import service.TieziService;

import javax.rmi.CORBA.Tie;
import java.util.List;

public class TieziServiceImpl implements TieziService {
    TieziDao tieziDao = new TieziDaoImpl();

    /**
     * 查询所有帖子
     * @return
     */
    @Override
    public List<Tiezi> tieziShow() {
        return tieziDao.TieziShow();
    }

    /**
     * 查询单个帖子
     * @param tiezi
     * @return
     */
    @Override
    public List<Tiezi> TieziSingleShow(Tiezi tiezi) {
        return tieziDao.TieziSingleShow(tiezi);
    }

    /**
     * 发帖
     * @param tiezi
     * @return
     */
    @Override
    public void fatie(Tiezi tiezi) {
        tieziDao.fatie(tiezi);
    }

    /**
     * 删帖
     * @param id
     */
    @Override
    public void deleteTiezi(int id) {
        tieziDao.deleteTiezi(id);
    }
}
