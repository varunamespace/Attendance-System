DROP TABLE IF EXISTS attendance;

CREATE TABLE attendance (
    id INTEGER,
    totalLeave INT,
    todayLeave BOOLEAN,
    PRIMARY KEY(id)
);
