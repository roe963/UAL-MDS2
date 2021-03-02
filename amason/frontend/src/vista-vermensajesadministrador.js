import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-vermensajesadministrador`
 *
 * VistaVermensajesadministrador element.
 *
 * @customElement
 * @polymer
 */
class VistaVermensajesadministrador extends PolymerElement {

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
        return 'vista-vermensajesadministrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVermensajesadministrador.is, VistaVermensajesadministrador);
