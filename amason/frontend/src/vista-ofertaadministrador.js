import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-ofertaadministrador`
 *
 * VistaOfertaadministrador element.
 *
 * @customElement
 * @polymer
 */
class VistaOfertaadministrador extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-ofertaadministrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOfertaadministrador.is, VistaOfertaadministrador);
