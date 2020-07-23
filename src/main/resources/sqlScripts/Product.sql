-- Table: public.Product

DROP TABLE public."Product";

CREATE TABLE public."Product"
(
    "KEY" character(30) COLLATE pg_catalog."default" NOT NULL,
    "LINK" character(100) COLLATE pg_catalog."default" NOT NULL,
    "NAME" character(50) COLLATE pg_catalog."default" NOT NULL,
    "PRICE" integer NOT NULL,
    "DATE_OF_SNAPSHOT" date NOT NULL,
    CONSTRAINT "Product_pkey" PRIMARY KEY ("KEY")
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public."Product"
    OWNER to postgres;