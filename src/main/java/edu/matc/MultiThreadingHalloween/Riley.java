package edu.matc.MultiThreadingHalloween;import org.apache.log4j.Logger;/** Created 10/03/17 * *  @author nfenev */class Riley implements Runnable {    private final Logger logger = Logger.getLogger(this.getClass());    private static final long RILEY_TIME_PER_SERVING_KID = 3000;    private Halloween halloween;    public Riley(Halloween halloweenIn) {        this.halloween = halloweenIn;        logger.info("Created Riley instance");    }    public void run() {        logger.info("Starting a Riley thread");        try {            Thread.sleep(RILEY_TIME_PER_SERVING_KID);        }        catch(InterruptedException iex) {            logger.info("Interrupted: ",iex);        }        logger.info("Riley thread started");        while(true) {            logger.info("Giving candy...");            halloween.giveCandy();        }    }}