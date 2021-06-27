import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaOferta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout>
 <vaadin-horizontal-layout style="flex-shrink: 0; align-self: center;">
  <label style="flex-shrink: 1; align-self: center; margin-right: var(--lumo-space-xs);">Finaliza el</label>
  <h5 id="h-fecha-oferta">01/01/1970</h5>
 </vaadin-horizontal-layout>
 <img style="flex-grow: 0; align-self: center; padding: var(--lumo-space-m); width: 300px; height: 300px;" id="img-producto">
 <h4 id="h-nombre-producto" style="align-self: center;">Nombre</h4>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; align-self: center;">
  <label style="flex-shrink: 1; align-self: center; text-decoration:line-through;" id="lbl-precio-normal">20.0€</label>
  <h5 id="h-precio-oferta">10.0€</h5>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-oferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOferta.is, VistaOferta);
