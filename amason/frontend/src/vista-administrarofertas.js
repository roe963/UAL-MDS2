import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-ofertasadministrador.js';
import './vista-agregaroferta.js';

class VistaAdministrarofertas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" id="layout-menu"></vaadin-vertical-layout>
<h3 style="margin-left: var(--lumo-space-xl);">Administrar Ofertas</h3>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" id="layout-anadirOferta" style="width: 100%; height: 100%; flex-grow: 1; align-items: stretch; margin-right: var(--lumo-space-m); margin-left: var(--lumo-space-xl);">
  <vista-agregaroferta></vista-agregaroferta>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: stretch; flex-grow: 1; margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-m);">
  <h4 style="margin-top: var(--lumo-space-l); margin-bottom: var(--lumo-space-xs);">Ofertas Activos/Desactivos</h4>
  <vaadin-horizontal-layout theme="spacing" id="layout-ofertas">
   <vista-ofertasadministrador></vista-ofertasadministrador>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-administrarofertas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarofertas.is, VistaAdministrarofertas);
