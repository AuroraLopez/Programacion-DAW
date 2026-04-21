const Inicio = () => {
  return (
    <div style={{ background: "#080c14", color: "#e8eaf0", minHeight: "100vh", fontFamily: "sans-serif", padding: "0 2rem 3rem" }}>

      {/* NAV */}
      <nav style={{ display: "flex", alignItems: "center", justifyContent: "space-between", padding: "1.2rem 0", borderBottom: "1px solid rgba(0,245,212,.1)", marginBottom: "3rem" }}>
        <span style={{ fontWeight: 900, fontSize: "1.2rem", color: "#00f5d4", letterSpacing: 2 }}>
          Pixel<span style={{ color: "#f72585" }}>Vault</span>
        </span>
        <div style={{ display: "flex", gap: "2rem" }}>
          <a href="#" style={{ color: "#8892a4", textDecoration: "none", fontWeight: 600 }}>Juegos</a>
          <a href="#" style={{ color: "#8892a4", textDecoration: "none", fontWeight: 600 }}>Ofertas</a>
          <a href="#" style={{ color: "#8892a4", textDecoration: "none", fontWeight: 600 }}>Novedades</a>
        </div>
        <button style={{ background: "linear-gradient(135deg,#00f5d4,#7b2fff)", border: "none", borderRadius: 7, color: "#080c14", fontWeight: 700, padding: ".5rem 1.2rem", cursor: "pointer" }}>
          🛒 Carrito
        </button>
      </nav>

      {/* HERO */}
      <section style={{ display: "flex", alignItems: "center", gap: "3rem", marginBottom: "4rem" }}>
        <div style={{ flex: 1 }}>
          <p style={{ color: "#00f5d4", fontSize: ".7rem", letterSpacing: 4, textTransform: "uppercase", marginBottom: "1rem" }}>
            ✦ Primavera 2026
          </p>
          <h1 style={{ fontSize: "2.8rem", fontWeight: 900, lineHeight: 1.1, marginBottom: "1.2rem" }}>
            Tu próxima<br />aventura<br />
            <span style={{ color: "#f72585" }}>te espera.</span>
          </h1>
          <p style={{ color: "#8892a4", lineHeight: 1.7, marginBottom: "2rem", maxWidth: 380 }}>
            Los mejores títulos para PC, PlayStation, Xbox y Nintendo. Descarga al instante y juega hoy mismo.
          </p>
          <div style={{ display: "flex", gap: "1rem" }}>
            <button style={{ background: "linear-gradient(135deg,#00f5d4,#7b2fff)", border: "none", borderRadius: 7, color: "#080c14", fontWeight: 700, padding: ".7rem 1.5rem", cursor: "pointer" }}>
              Explorar catálogo
            </button>
            <button style={{ background: "transparent", border: "1px solid rgba(0,245,212,.4)", borderRadius: 7, color: "#00f5d4", fontWeight: 700, padding: ".7rem 1.5rem", cursor: "pointer" }}>
              Ver ofertas
            </button>
          </div>
        </div>
        <div style={{ flex: 1 }}>
          <img
            src="https://images.unsplash.com/photo-1542751371-adc38448a05e?w=600&q=80"
            alt="Gaming setup"
            style={{ width: "100%", borderRadius: 20, objectFit: "cover", height: 360 }}
          />
        </div>
      </section>

      {/* SECCIÓN INTERMEDIA */}
      <section style={{ display: "flex", gap: "1.5rem", marginBottom: "4rem" }}>
        <div style={{ flex: 1, position: "relative", borderRadius: 16, overflow: "hidden" }}>
          <img
            src="https://images.unsplash.com/photo-1552820728-8b83bb6b773f?w=600&q=80"
            alt="Juegos de acción"
            style={{ width: "100%", height: 260, objectFit: "cover", display: "block" }}
          />
          <div style={{ position: "absolute", inset: 0, background: "linear-gradient(to top, rgba(8,12,20,.9) 0%, transparent 60%)", padding: "1.5rem", display: "flex", flexDirection: "column", justifyContent: "flex-end" }}>
            <p style={{ fontSize: ".65rem", letterSpacing: 3, color: "#00f5d4", textTransform: "uppercase", marginBottom: ".4rem" }}>Acción y aventura</p>
            <h3 style={{ fontSize: "1.3rem", fontWeight: 800, marginBottom: ".5rem" }}>Vive la emoción</h3>
            <p style={{ color: "#8892a4", fontSize: ".85rem" }}>Los títulos más intensos del momento</p>
          </div>
        </div>

        <div style={{ flex: 1, position: "relative", borderRadius: 16, overflow: "hidden" }}>
          <img
            src="https://images.unsplash.com/photo-1511512578047-dfb367046420?w=600&q=80"
            alt="Ofertas especiales"
            style={{ width: "100%", height: 260, objectFit: "cover", display: "block" }}
          />
          <div style={{ position: "absolute", inset: 0, background: "linear-gradient(to top, rgba(8,12,20,.9) 0%, transparent 60%)", padding: "1.5rem", display: "flex", flexDirection: "column", justifyContent: "flex-end" }}>
            <p style={{ fontSize: ".65rem", letterSpacing: 3, color: "#f72585", textTransform: "uppercase", marginBottom: ".4rem" }}>Ofertas flash</p>
            <h3 style={{ fontSize: "1.3rem", fontWeight: 800, marginBottom: ".5rem" }}>Hasta −75%</h3>
            <p style={{ color: "#8892a4", fontSize: ".85rem" }}>Solo por tiempo limitado</p>
          </div>
        </div>
      </section>

      {/* FOOTER SIMPLE */}
      <div style={{ borderTop: "1px solid rgba(255,255,255,.06)", paddingTop: "1.5rem", display: "flex", justifyContent: "space-between", color: "#8892a4", fontSize: ".8rem" }}>
        <span>© 2026 PixelVault</span>
        <span>Privacidad · Términos · Contacto</span>
      </div>

    </div>
  );
};

export default Inicio;